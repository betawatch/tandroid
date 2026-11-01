package rh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.k20;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u6 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ k20 c;
    public final /* synthetic */ vh.d d;
    public final /* synthetic */ EditTextBoldCursor e;
    public final /* synthetic */ org.telegram.ui.ActionBar.z2[] f;

    public /* synthetic */ u6(boolean[] zArr, k20 k20Var, EditTextBoldCursor editTextBoldCursor, vh.d dVar, org.telegram.ui.ActionBar.z2[] z2VarArr) {
        this.b = zArr;
        this.c = k20Var;
        this.e = editTextBoldCursor;
        this.d = dVar;
        this.f = z2VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    this.c.a(Long.valueOf(TextUtils.isEmpty(obj) ? 0L : Long.parseLong(obj)), new w6(editTextBoldCursor, this.f, 2));
                    break;
                }
                break;
            default:
                boolean[] zArr2 = this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.c.a(0L, new l5(zArr2, this.e, this.f, 2));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ u6(boolean[] zArr, k20 k20Var, vh.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.z2[] z2VarArr) {
        this.b = zArr;
        this.c = k20Var;
        this.d = dVar;
        this.e = editTextBoldCursor;
        this.f = z2VarArr;
    }
}
