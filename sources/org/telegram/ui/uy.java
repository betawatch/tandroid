package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class uy implements org.telegram.ui.Components.ml0 {
    public final Rect a = new Rect();
    public final /* synthetic */ yy b;

    public uy(yy yyVar) {
        this.b = yyVar;
    }

    @Override // org.telegram.ui.Components.ml0
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

    @Override // org.telegram.ui.Components.ml0
    public final void h() {
    }

    @Override // org.telegram.ui.Components.ml0
    public final void p(float f10) {
    }
}
