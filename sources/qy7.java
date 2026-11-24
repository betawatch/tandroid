// default package

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qy7 implements ee, zy2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xz7 b;

    public /* synthetic */ qy7(xz7 xz7Var, byte b) {
        this.a = b;
        this.b = xz7Var;
    }

    @Override // zy2
    public final void g(wy2 wy2Var) {
        byte b = this.a;
        xz7 xz7Var = this.b;
        switch (b) {
            case 2:
                xz7Var.Z[5].setText(wy2Var.a);
                xz7Var.s = wy2Var.d;
                break;
            default:
                xz7Var.Z[0].setText(wy2Var.a);
                if (xz7Var.V0.indexOf(wy2Var.a) != -1) {
                    xz7Var.a1 = true;
                    String str = (String) xz7Var.W0.get(wy2Var.a);
                    xz7Var.Z[1].setText(str);
                    String str2 = (String) xz7Var.Y0.get(str);
                    xz7Var.Z[2].setHintText(str2 != null ? str2.replace('X', (char) 8211) : null);
                    xz7Var.a1 = false;
                }
                gm.d3(new ny7(xz7Var, (byte) 3), 300L);
                xz7Var.Z[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor = xz7Var.Z[2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        xz7 xz7Var = this.b;
        switch (b) {
            case 0:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    xz7Var.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 1:
                xz7Var.finishFragment();
                break;
            case 2:
            case 3:
            default:
                xz7Var.q1();
                break;
            case 4:
                xz7Var.r1();
                break;
        }
    }
}
