// default package

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class vwb extends o7 {
    public boolean a = false;
    public final /* synthetic */ axb b;

    public vwb(axb axbVar) {
        this.b = axbVar;
    }

    @Override // o7
    public final void h() {
        axb axbVar = this.b;
        byte b = 0;
        if (axbVar.a.getVisibility() != 0) {
            axbVar.a.setVisibility(0);
            axbVar.a.setAlpha(0.0f);
        }
        axbVar.r.setVisibility(8);
        axbVar.d.f();
        axbVar.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        axbVar.s.animate().alpha(0.0f).setDuration(150L).setListener(new uwb(this, b)).start();
        this.a = false;
    }

    @Override // o7
    public final void l(EditTextBoldCursor editTextBoldCursor) {
        String obj = editTextBoldCursor.getText().toString();
        zwb zwbVar = this.b.e;
        if (zwbVar.e != null) {
            Utilities.g.a(zwbVar.e);
            zwbVar.e = null;
        }
        byte b = 0;
        byte b2 = 1;
        if (TextUtils.isEmpty(obj)) {
            zwbVar.c.clear();
            zwbVar.d.clear();
            zwbVar.f();
            zwbVar.h.r.setVisibility(8);
        } else {
            int i = zwbVar.f + 1;
            zwbVar.f = i;
            to3 to3Var = Utilities.g;
            ywb ywbVar = new ywb(zwbVar, obj, i, b);
            zwbVar.e = ywbVar;
            to3Var.d(ywbVar, 300L);
        }
        if (this.a || TextUtils.isEmpty(obj)) {
            if (this.a && TextUtils.isEmpty(obj)) {
                h();
                return;
            }
            return;
        }
        if (this.b.s.getVisibility() != 0) {
            this.b.s.setVisibility(0);
            this.b.s.setAlpha(0.0f);
        }
        this.b.a.animate().alpha(0.0f).setDuration(150L).setListener(new uwb(this, b2)).start();
        this.b.e.d.clear();
        this.b.e.c.clear();
        this.b.e.f();
        this.b.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.a = true;
    }
}
