package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class vy implements org.telegram.ui.Components.pl0 {
    public final Rect a = new Rect();
    public final /* synthetic */ zy b;

    public vy(zy zyVar) {
        this.b = zyVar;
    }

    @Override // org.telegram.ui.Components.pl0
    public final boolean c(float f7, float f10, int i10, View view) {
        zy zyVar = this.b;
        if (zyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            ImageView imageView = (ImageView) view.getTag(R.id.object_tag);
            Rect rect = this.a;
            imageView.getHitRect(rect);
            if (!rect.contains((int) f7, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zyVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new uy(this, i10, 0));
                zyVar.showDialog(alertDialog$Builder.a);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.pl0
    public final void g() {
    }

    @Override // org.telegram.ui.Components.pl0
    public final void q(float f7) {
    }
}
