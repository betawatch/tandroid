package xh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class a2 implements TextView.OnEditorActionListener {
    public final /* synthetic */ z1 a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2[] c;
    public final /* synthetic */ View d;

    public a2(z1 z1Var, Utilities.Callback callback, org.telegram.ui.ActionBar.c2[] c2VarArr, View view) {
        this.a = z1Var;
        this.b = callback;
        this.c = c2VarArr;
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
        org.telegram.ui.ActionBar.c2 c2Var = this.c[0];
        if (c2Var != null) {
            c2Var.dismiss();
        }
        View view = this.d;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
