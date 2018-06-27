package com.eighteengray.procamera.imageprocess.widget;

import android.os.Bundle;
import android.widget.RelativeLayout;

import com.eighteengray.commonutillibrary.DimenUtil;
import com.eighteengray.procamera.business.GenerateDataUtils;
import com.eighteengray.procamera.imageprocess.bean.VerticalRecyclerItem;
import com.eighteengray.procamera.widget.dialogfragment.BaseRecyclerDialogFragment;
import com.eighteengray.procameralibrary.common.Constants;
import java.util.ArrayList;
import java.util.List;


public class FilterMenuDialog extends BaseRecyclerDialogFragment
{

    List<VerticalRecyclerItem> verticalRecyclerItemArrayList = new ArrayList<>();


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        verticalRecyclerItemArrayList = GenerateDataUtils.generateFilterMenuList();
    }

    @Override
    protected void showRecyclerView()
    {
        super.showRecyclerView();
        recycler_layout.setLayoutManagerNum(2);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) recycler_layout.getLayoutParams();
        layoutParams.width = RelativeLayout.LayoutParams.MATCH_PARENT;
        layoutParams.height = DimenUtil.dp2px(getActivity(), 300);
        recycler_layout.setLayoutParams(layoutParams);
        recycler_layout.showRecyclerView(GenerateDataUtils.generateDataBeanList(8, verticalRecyclerItemArrayList), Constants.viewModelPackage);
    }

}
