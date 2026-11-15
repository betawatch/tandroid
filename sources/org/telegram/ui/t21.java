package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class t21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u21 b;

    public /* synthetic */ t21(u21 u21Var, int i7) {
        this.a = i7;
        this.b = u21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb2;
        int i7 = this.a;
        u21 u21Var = this.b;
        switch (i7) {
            case 0:
                String str = u21Var.b.text;
                if (str == null || !str.equals("AUTH_TOKEN_EXCEPTION")) {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.y0.r(null, 2131751105, sb3, "\n");
                    sb3.append(u21Var.b.text);
                    sb2 = sb3.toString();
                } else {
                    sb2 = org.telegram.messenger.hd.M0(2131754709, null);
                }
                org.telegram.ui.Components.t4.r0(u21Var.c, org.telegram.messenger.hd.M0(2131753894, null), sb2, null);
                break;
            default:
                org.telegram.ui.Components.t4.r0(u21Var.c, org.telegram.messenger.hd.M0(2131753894, null), org.telegram.messenger.hd.M0(2131751105, null), null);
                break;
        }
    }
}
