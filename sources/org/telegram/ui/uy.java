package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class uy implements org.telegram.ui.Components.ll0 {
    public final Rect a = new Rect();
    public final /* synthetic */ yy b;

    public uy(yy yyVar) {
        this.b = yyVar;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean c(float f10, float f11, int i10, View view) {
        yy yyVar = this.b;
        if (yyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            ImageView imageView = (ImageView) view.getTag(R.id.object_tag);
            Rect rect = this.a;
            imageView.getHitRect(rect);
            if (!rect.contains((int) f10, (int) f11)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yyVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new ty(this, i10, 0));
                yyVar.showDialog(alertDialog$Builder.a);
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
