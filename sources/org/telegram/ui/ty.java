package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ty implements org.telegram.ui.Components.ll0 {
    public final Rect a = new Rect();
    public final /* synthetic */ xy b;

    public ty(xy xyVar) {
        this.b = xyVar;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean c(float f10, float f11, int i10, View view) {
        xy xyVar = this.b;
        if (xyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            ImageView imageView = (ImageView) view.getTag(R.id.object_tag);
            Rect rect = this.a;
            imageView.getHitRect(rect);
            if (!rect.contains((int) f10, (int) f11)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xyVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new sy(this, i10, 0));
                xyVar.showDialog(alertDialog$Builder.a);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ll0
    public final void h() {
    }

    @Override // org.telegram.ui.Components.ll0
    public final void p(float f10) {
    }
}
