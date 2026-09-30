package xh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class b2 implements TextView.OnEditorActionListener {
    public final /* synthetic */ a2 a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.ActionBar.a2[] c;
    public final /* synthetic */ View d;

    public b2(a2 a2Var, Utilities.Callback callback, org.telegram.ui.ActionBar.a2[] a2VarArr, View view) {
        this.a = a2Var;
        this.b = callback;
        this.c = a2VarArr;
        this.d = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        a2 a2Var = this.a;
        String obj = a2Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 12) {
            AndroidUtilities.shakeView(a2Var);
            return true;
        }
        this.b.run(obj);
        org.telegram.ui.ActionBar.a2 a2Var2 = this.c[0];
        if (a2Var2 != null) {
            a2Var2.dismiss();
        }
        View view = this.d;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
