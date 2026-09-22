package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class zy implements org.telegram.ui.Components.cl0 {
    public final Rect a = new Rect();
    public final /* synthetic */ dz b;

    public zy(dz dzVar) {
        this.b = dzVar;
    }

    @Override // org.telegram.ui.Components.cl0
    public final boolean c(float f7, float f10, int i10, View view) {
        dz dzVar = this.b;
        if (dzVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            ImageView imageView = (ImageView) view.getTag(R.id.object_tag);
            Rect rect = this.a;
            imageView.getHitRect(rect);
            if (!rect.contains((int) f7, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dzVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new yy(this, i10, 0));
                dzVar.showDialog(alertDialog$Builder.a);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.cl0
    public final void g() {
    }

    @Override // org.telegram.ui.Components.cl0
    public final void q(float f7) {
    }
}
