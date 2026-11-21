package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qz0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uz0 b;

    public /* synthetic */ qz0(uz0 uz0Var, int i7) {
        this.a = i7;
        this.b = uz0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                uz0 uz0Var = this.b;
                if (uz0Var.Z == null) {
                    uz0Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
