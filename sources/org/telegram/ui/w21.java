package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x21 b;

    public /* synthetic */ w21(x21 x21Var, int i7) {
        this.a = i7;
        this.b = x21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb2;
        int i7 = this.a;
        x21 x21Var = this.b;
        switch (i7) {
            case 0:
                String str = x21Var.b.text;
                if (str == null || !str.equals("AUTH_TOKEN_EXCEPTION")) {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.c0.u(null, 2131751093, sb3, "\n");
                    sb3.append(x21Var.b.text);
                    sb2 = sb3.toString();
                } else {
                    sb2 = org.telegram.messenger.gd.N0(2131754708, null);
                }
                org.telegram.ui.Components.b5.r0(x21Var.c, org.telegram.messenger.gd.N0(2131753891, null), sb2, null);
                break;
            default:
                org.telegram.ui.Components.b5.r0(x21Var.c, org.telegram.messenger.gd.N0(2131753891, null), org.telegram.messenger.gd.N0(2131751093, null), null);
                break;
        }
    }
}
