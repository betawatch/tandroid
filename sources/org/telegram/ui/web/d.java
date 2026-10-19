package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class d extends f61 {
    public static final /* synthetic */ int a = 0;

    static {
        f61.setup(new d());
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        e eVar = (e) view;
        if (g61Var.G == null) {
            eVar.setAsShowMore((k) g61Var.H);
            return;
        }
        int i10 = g61Var.z;
        String charSequence = g61Var.l.toString();
        View.OnClickListener onClickListener = g61Var.D;
        k kVar = (k) g61Var.H;
        ImageView imageView = eVar.a;
        imageView.setVisibility(0);
        int i11 = kVar.F;
        int i12 = kVar.H;
        TextView textView = eVar.b;
        textView.setTextColor(i12);
        int m12 = h6.m1(0.6f, i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(m12, mode));
        ImageView imageView2 = eVar.c;
        imageView2.setColorFilter(new PorterDuffColorFilter(h6.m1(0.6f, i12), mode));
        imageView2.setBackground(h6.a0(0, h6.m1(0.15f, i12), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
        imageView.setImageResource(i10 == 0 ? R.drawable.msg_clear_recent : R.drawable.msg_search);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        eVar.d.setColor(h6.m1(0.1f, kVar.H));
        eVar.e = z10;
        eVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new e(context);
    }
}
