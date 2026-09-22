package xh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class a2 implements TextView.OnEditorActionListener {
    public final /* synthetic */ z1 a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2[] c;
    public final /* synthetic */ View d;

    public a2(z1 z1Var, Utilities.Callback callback, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.a = z1Var;
        this.b = callback;
        this.c = b2VarArr;
        this.d = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        z1 z1Var = this.a;
        String obj = z1Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 12) {
            AndroidUtilities.shakeView(z1Var);
            return true;
        }
        this.b.run(obj);
        org.telegram.ui.ActionBar.b2 b2Var = this.c[0];
        if (b2Var != null) {
            b2Var.dismiss();
        }
        View view = this.d;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
