package qh;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.h51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class u2 extends cl0 {
    public final /* synthetic */ z2 c;

    public u2(z2 z2Var) {
        this.c = z2Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f == 2;
    }

    @Override // org.telegram.ui.Components.cl0
    public final String F(int i10) {
        MediaController.PhotoEntry photoEntry;
        int i11 = i10 - 2;
        z2 z2Var = this.c;
        if (z2Var.W) {
            if (i11 == 0) {
                return null;
            }
            i11 = i10 - 3;
        } else if (z2Var.a0) {
            if (i11 >= 0 && i11 < z2Var.V.size()) {
                return LocaleController.formatYearMont(((r6) z2Var.V.get(i11)).d / 1000, true);
            }
            i11 -= z2Var.V.size();
        }
        ArrayList arrayList = z2Var.c0;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) z2Var.c0.get(i11)) == null) {
            return null;
        }
        long j10 = photoEntry.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j10 /= 1000;
        }
        return LocaleController.formatYearMont(j10, true);
    }

    @Override // org.telegram.ui.Components.cl0
    public final void G(sl0 sl0Var, float f10, int[] iArr) {
        int k10 = k();
        float width = (sl0Var.getWidth() - sl0Var.getPaddingLeft()) - sl0Var.getPaddingRight();
        z2 z2Var = this.c;
        l2 l2Var = z2Var.e;
        float f11 = l2Var.J;
        int i10 = (int) (((int) (width / f11)) * z2Var.L);
        int ceil = (int) Math.ceil(k10 / f11);
        float lerp = (AndroidUtilities.lerp(0, Math.max(0, r2 - ((AndroidUtilities.displaySize.y - sl0Var.getPaddingTop()) - sl0Var.getPaddingBottom())), f10) / (ceil * i10)) * ceil;
        int round = Math.round(lerp);
        iArr[0] = Math.max(0, l2Var.J * round) + 2;
        iArr[1] = sl0Var.getPaddingTop() + ((int) ((lerp - round) * i10));
    }

    @Override // org.telegram.ui.Components.cl0
    public final float H(sl0 sl0Var) {
        int k10 = k();
        float width = (sl0Var.getWidth() - sl0Var.getPaddingLeft()) - sl0Var.getPaddingRight();
        float f10 = this.c.e.J;
        return (Math.max(0, sl0Var.computeVerticalScrollOffset() - r2.getPadding()) - sl0Var.getPaddingTop()) / ((((int) Math.ceil(k10 / f10)) * ((int) (((int) (width / f10)) * r2.L))) - (AndroidUtilities.displaySize.y - sl0Var.getPaddingTop()));
    }

    @Override // f2.p0
    public final int h() {
        return k() + 3;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == 0 || i10 == h() - 1) {
            return 0;
        }
        return i10 == 1 ? 1 : 2;
    }

    @Override // f2.p0
    public final int k() {
        z2 z2Var = this.c;
        ArrayList arrayList = z2Var.c0;
        int size = arrayList == null ? 0 : arrayList.size();
        return z2Var.W ? size + 1 : z2Var.a0 ? z2Var.V.size() + size : size;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        z2 z2Var = this.c;
        ArrayList arrayList = z2Var.e0;
        ArrayList arrayList2 = z2Var.V;
        int i11 = m1Var.f;
        View view = m1Var.a;
        if (i11 == 0) {
            ((x2) view).a = i10 == 0 ? z2Var.getPadding() : -1;
            return;
        }
        if (i11 == 2) {
            w2 w2Var = (w2) view;
            boolean z4 = i10 == 2;
            boolean z10 = i10 == 4;
            w2Var.R = z4;
            w2Var.S = z10;
            w2Var.J = new t2(this, w2Var, 0);
            w2Var.K = new t2(this, w2Var, 1);
            int i12 = i10 - 2;
            if (z2Var.W) {
                if (i12 == 0) {
                    w2Var.f(-1, false, false);
                    w2Var.e(arrayList2.size(), (r6) arrayList2.get(0));
                    return;
                }
                i12 = i10 - 3;
            } else if (z2Var.a0) {
                if (i12 >= 0 && i12 < arrayList2.size()) {
                    w2Var.f(-1, false, false);
                    w2Var.e(0, (r6) arrayList2.get(i12));
                    return;
                }
                i12 -= arrayList2.size();
            }
            ArrayList arrayList3 = z2Var.c0;
            if (arrayList3 == null || i12 < 0 || i12 >= arrayList3.size()) {
                return;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) z2Var.c0.get(i12);
            w2Var.f(arrayList.indexOf(photoEntry), !arrayList.isEmpty() || z2Var.N, w2Var.P == photoEntry);
            w2Var.P = photoEntry;
            w2Var.g((photoEntry == null || !photoEntry.isVideo || photoEntry.isLivePhoto()) ? null : AndroidUtilities.formatShortDuration(photoEntry.duration));
            w2Var.C = null;
            if (photoEntry == null) {
                w2Var.L = null;
            } else if (photoEntry.isVideo) {
                StringBuilder sb = new StringBuilder();
                org.telegram.ui.b.i(R.string.AttachVideo, ", ", sb);
                sb.append(LocaleController.formatDuration(photoEntry.duration));
                w2Var.L = sb.toString();
            } else {
                w2Var.L = LocaleController.getString(R.string.AttachPhoto);
            }
            w2Var.b(photoEntry);
            w2Var.invalidate();
            if (z2Var.J) {
                w2Var.F.setOnClickListener(new q31(this, photoEntry, w2Var, 3));
            }
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        z2 z2Var = this.c;
        if (i10 == 0) {
            view = new x2(z2Var, z2Var.getContext());
        } else if (i10 == 1) {
            Context context = z2Var.getContext();
            boolean z4 = z2Var.I;
            h51 h51Var = new h51(context, 8);
            h51Var.setPadding(AndroidUtilities.dp(z4 ? 14.0f : 16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(z2Var.getTitle());
            h51Var.addView(textView, k7.c6.d(-1, -1.0f, 119, 0.0f, 0.0f, z4 ? 32.0f : 0.0f, 0.0f));
            z2Var.f0 = h51Var;
            view = h51Var;
        } else {
            view = new w2(z2Var.getContext(), z2Var.b, z2Var.L, z2Var.J);
        }
        return new el0(view);
    }

    @Override // f2.p0
    public final void y(f2.m1 m1Var) {
        z2 z2Var = this.c;
        ArrayList arrayList = z2Var.e0;
        if (m1Var.f == 2) {
            w2 w2Var = (w2) m1Var.a;
            Object obj = w2Var.P;
            if (!(obj instanceof MediaController.PhotoEntry)) {
                w2Var.f(-1, false, false);
            } else {
                w2Var.f(arrayList.indexOf((MediaController.PhotoEntry) obj), !arrayList.isEmpty() || z2Var.N, false);
            }
        }
    }
}
