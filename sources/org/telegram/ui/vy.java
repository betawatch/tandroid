package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class vy implements org.telegram.ui.Components.kl0 {
    public final Rect a = new Rect();
    public final /* synthetic */ zy b;

    public vy(zy zyVar) {
        this.b = zyVar;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean c(float f10, float f11, int i10, View view) {
        zy zyVar = this.b;
        if (zyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.f4)) {
            ImageView imageView = (ImageView) view.getTag(R.id.object_tag);
            Rect rect = this.a;
            imageView.getHitRect(rect);
            if (!rect.contains((int) f10, (int) f11)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zyVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new uy(this, i10, 0));
                zyVar.showDialog(alertDialog$Builder.a);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.kl0
    public final void h() {
    }

    @Override // org.telegram.ui.Components.kl0
    public final void p(float f10) {
    }
}
