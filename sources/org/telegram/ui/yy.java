package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class yy implements org.telegram.ui.Components.hm0 {
    public final Rect a = new Rect();
    public final /* synthetic */ cz b;

    public yy(cz czVar) {
        this.b = czVar;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean c(float f7, float f10, int i10, View view) {
        cz czVar = this.b;
        if (czVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            ImageView imageView = (ImageView) view.getTag(R.id.object_tag);
            Rect rect = this.a;
            imageView.getHitRect(rect);
            if (!rect.contains((int) f7, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(czVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new xy(this, i10, 0));
                czVar.showDialog(alertDialog$Builder.a);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.hm0
    public final void h() {
    }

    @Override // org.telegram.ui.Components.hm0
    public final void q(float f7) {
    }
}
