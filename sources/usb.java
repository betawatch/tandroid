// default package

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class usb extends n7 {
    public boolean a = false;
    public final /* synthetic */ zsb b;

    public usb(zsb zsbVar) {
        this.b = zsbVar;
    }

    @Override // n7
    public final void h() {
        zsb zsbVar = this.b;
        byte b = 0;
        if (zsbVar.a.getVisibility() != 0) {
            zsbVar.a.setVisibility(0);
            zsbVar.a.setAlpha(0.0f);
        }
        zsbVar.r.setVisibility(8);
        zsbVar.d.f();
        zsbVar.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        zsbVar.s.animate().alpha(0.0f).setDuration(150L).setListener(new tsb(this, b)).start();
        this.a = false;
    }

    @Override // n7
    public final void l(EditTextBoldCursor editTextBoldCursor) {
        String obj = editTextBoldCursor.getText().toString();
        ysb ysbVar = this.b.e;
        if (ysbVar.e != null) {
            Utilities.g.a(ysbVar.e);
            ysbVar.e = null;
        }
        byte b = 0;
        byte b2 = 1;
        if (TextUtils.isEmpty(obj)) {
            ysbVar.c.clear();
            ysbVar.d.clear();
            ysbVar.f();
            ysbVar.h.r.setVisibility(8);
        } else {
            int i = ysbVar.f + 1;
            ysbVar.f = i;
            co3 co3Var = Utilities.g;
            xsb xsbVar = new xsb(ysbVar, obj, i, b);
            ysbVar.e = xsbVar;
            co3Var.d(xsbVar, 300L);
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
        this.b.a.animate().alpha(0.0f).setDuration(150L).setListener(new tsb(this, b2)).start();
        this.b.e.d.clear();
        this.b.e.c.clear();
        this.b.e.f();
        this.b.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.a = true;
    }
}
