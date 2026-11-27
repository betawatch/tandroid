// default package

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class vz7 implements fd, jy2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b18 b;

    public /* synthetic */ vz7(b18 b18Var, byte b) {
        this.a = b;
        this.b = b18Var;
    }

    @Override // jy2
    public final void B(gy2 gy2Var) {
        byte b = this.a;
        b18 b18Var = this.b;
        switch (b) {
            case 2:
                b18Var.Z[5].setText(gy2Var.a);
                b18Var.s = gy2Var.d;
                break;
            default:
                b18Var.Z[0].setText(gy2Var.a);
                if (b18Var.V0.indexOf(gy2Var.a) != -1) {
                    b18Var.a1 = true;
                    String str = (String) b18Var.W0.get(gy2Var.a);
                    b18Var.Z[1].setText(str);
                    String str2 = (String) b18Var.Y0.get(str);
                    b18Var.Z[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    b18Var.a1 = false;
                }
                hl.d3(new sz7(b18Var, (byte) 3), 300L);
                b18Var.Z[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = b18Var.Z[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        b18 b18Var = this.b;
        switch (b) {
            case 0:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    b18Var.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 1:
                b18Var.finishFragment();
                break;
            case 2:
            case 3:
            default:
                b18Var.q1();
                break;
            case 4:
                b18Var.r1();
                break;
        }
    }
}
