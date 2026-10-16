package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u91 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;

    public /* synthetic */ u91(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.a = i10;
        this.b = context;
        this.c = c6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                new zh.f7(this.b, this.c).show();
                break;
            case 1:
                new zh.f7(this.b, this.c).show();
                break;
            default:
                new zh.f7(this.b, this.c).show();
                break;
        }
    }
}
