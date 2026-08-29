package sf;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ h1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ r1 c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ eg.d1 e;
    public final /* synthetic */ Utilities.Callback f;
    public final /* synthetic */ c2[] g;
    public final /* synthetic */ View h;

    public k1(h1 h1Var, int i10, r1 r1Var, TextView textView, eg.d1 d1Var, Utilities.Callback callback, c2[] c2VarArr, View view) {
        this.a = h1Var;
        this.b = i10;
        this.c = r1Var;
        this.d = textView;
        this.e = d1Var;
        this.f = callback;
        this.g = c2VarArr;
        this.h = view;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        h1 h1Var = this.a;
        String obj = h1Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            AndroidUtilities.shakeView(h1Var);
            return true;
        }
        s1 f9 = s1.f(this.b);
        r1 r1Var = this.c;
        int i11 = r1Var == null ? -1 : r1Var.a;
        r1 d = f9.d(obj);
        if (d != null && d.a != i11) {
            AndroidUtilities.shakeView(h1Var);
            this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
            this.e.run(Boolean.TRUE);
            return true;
        }
        this.f.run(obj);
        c2[] c2VarArr = this.g;
        c2 c2Var = c2VarArr[0];
        if (c2Var != null) {
            c2Var.dismiss();
        }
        if (c2VarArr[0] == n1.h) {
            n1.h = null;
        }
        View view = this.h;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
