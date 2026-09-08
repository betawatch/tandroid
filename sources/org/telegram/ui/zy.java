package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class zy implements org.telegram.ui.Components.cl0 {
    public final Rect a = new Rect();
    public final /* synthetic */ dz b;

    public zy(dz dzVar) {
        this.b = dzVar;
    }

    @Override // org.telegram.ui.Components.cl0
    public final boolean d(float f7, float f10, int i10, View view) {
        dz dzVar = this.b;
        if (dzVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.f4)) {
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
    public final void h() {
    }

    @Override // org.telegram.ui.Components.cl0
    public final void q(float f7) {
    }
}
