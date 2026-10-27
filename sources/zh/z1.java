package zh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class z1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ y1 a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2[] c;
    public final /* synthetic */ View d;

    public z1(y1 y1Var, Utilities.Callback callback, org.telegram.ui.ActionBar.e2[] e2VarArr, View view) {
        this.a = y1Var;
        this.b = callback;
        this.c = e2VarArr;
        this.d = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        y1 y1Var = this.a;
        String obj = y1Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 12) {
            AndroidUtilities.shakeView(y1Var);
            return true;
        }
        this.b.run(obj);
        org.telegram.ui.ActionBar.e2 e2Var = this.c[0];
        if (e2Var != null) {
            e2Var.dismiss();
        }
        View view = this.d;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
