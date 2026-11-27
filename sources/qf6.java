// default package

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class qf6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sf6 b;

    public /* synthetic */ qf6(sf6 sf6Var, byte b) {
        this.a = b;
        this.b = sf6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        sf6 sf6Var = this.b;
        switch (b) {
            case 0:
                m7 m7Var = sf6Var.c;
                m7Var.requestFocus();
                String str = sf6Var.L;
                if (str != null && str.length() > 1) {
                    String obj = m7Var.getText().toString();
                    int length = obj.length();
                    int i = 0;
                    while (i < length && obj.charAt(i) <= ' ') {
                        i++;
                    }
                    int length2 = sf6Var.L.length() + i;
                    m7Var.setSelection(Utilities.j(length2 + ((length2 < 0 || length2 >= obj.length() || obj.charAt(length2) != ' ') ? 0 : 1), obj.length(), 0), m7Var.getText().length());
                    break;
                } else {
                    m7Var.setSelection(0, m7Var.getText().length());
                    break;
                }
                break;
            case 1:
                sf6Var.p(true);
                break;
            case 2:
                sf6Var.n(false);
                break;
            default:
                m7 m7Var2 = sf6Var.c;
                if (m7Var2 != null) {
                    m7Var2.requestFocus();
                    m7Var2.setSelection(m7Var2.length());
                    hl.E3(m7Var2);
                    break;
                }
                break;
        }
    }
}
