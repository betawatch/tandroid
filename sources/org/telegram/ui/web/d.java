package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class d extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new d());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        e eVar = (e) view;
        if (h51Var.G == null) {
            eVar.setAsShowMore((k) h51Var.H);
            return;
        }
        int i10 = h51Var.z;
        String charSequence = h51Var.l.toString();
        View.OnClickListener onClickListener = h51Var.D;
        k kVar = (k) h51Var.H;
        ImageView imageView = eVar.a;
        imageView.setVisibility(0);
        int i11 = kVar.C;
        int i12 = kVar.E;
        TextView textView = eVar.b;
        textView.setTextColor(i12);
        int l1 = k6.l1(0.6f, i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(l1, mode));
        ImageView imageView2 = eVar.c;
        imageView2.setColorFilter(new PorterDuffColorFilter(k6.l1(0.6f, i12), mode));
        imageView2.setBackground(k6.Z(0, k6.l1(0.15f, i12), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
        imageView.setImageResource(i10 == 0 ? R.drawable.msg_clear_recent : R.drawable.msg_search);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        eVar.d.setColor(k6.l1(0.1f, kVar.E));
        eVar.e = z4;
        eVar.setWillNotDraw(!z4);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new e(context);
    }
}
