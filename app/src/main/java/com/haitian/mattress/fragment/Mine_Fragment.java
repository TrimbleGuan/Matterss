package com.haitian.mattress.fragment;

import com.haitian.mattress.R;
import com.haitian.mattress.base.BaseFragment;

public class Mine_Fragment extends BaseFragment {
    @Override
    protected Object provideBindView() {
        return this;
    }

    @Override
    protected int provideLayoutId() {
        return R.layout.mine_fragment;
    }
}
