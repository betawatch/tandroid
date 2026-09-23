package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class wy implements org.telegram.ui.Components.dl0 {
    public final Rect a = new Rect();
    public final /* synthetic */ az b;

    public wy(az azVar) {
        this.b = azVar;
    }

    @Override // org.telegram.ui.Components.dl0
    public final boolean c(float f7, float f10, int i10, View view) {
        az azVar = this.b;
        if (azVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            ImageView imageView = (ImageView) view.getTag(R.id.object_tag);
            Rect rect = this.a;
            imageView.getHitRect(rect);
            if (!rect.contains((int) f7, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(azVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new vy(this, i10, 0));
                azVar.showDialog(alertDialog$Builder.a);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.dl0
    public final void g() {
    }

    @Override // org.telegram.ui.Components.dl0
    public final void q(float f7) {
    }
}
