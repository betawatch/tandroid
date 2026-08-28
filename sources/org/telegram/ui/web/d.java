package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class d extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new d());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        e eVar = (e) view;
        if (l41Var.G == null) {
            eVar.setAsShowMore((k) l41Var.H);
            return;
        }
        int i9 = l41Var.z;
        String charSequence = l41Var.l.toString();
        View.OnClickListener onClickListener = l41Var.D;
        k kVar = (k) l41Var.H;
        ImageView imageView = eVar.a;
        imageView.setVisibility(0);
        int i10 = kVar.B;
        int i11 = kVar.D;
        TextView textView = eVar.b;
        textView.setTextColor(i11);
        int l1 = f6.l1(0.6f, i11);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(l1, mode));
        ImageView imageView2 = eVar.c;
        imageView2.setColorFilter(new PorterDuffColorFilter(f6.l1(0.6f, i11), mode));
        imageView2.setBackground(f6.Z(0, f6.l1(0.15f, i11), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
        imageView.setImageResource(i9 == 0 ? R.drawable.msg_clear_recent : R.drawable.msg_search);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        eVar.d.setColor(f6.l1(0.1f, kVar.D));
        eVar.e = z10;
        eVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        return new e(context);
    }
}
