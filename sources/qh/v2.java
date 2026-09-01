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
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.c51;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class v2 extends dl0 {
    public final /* synthetic */ a3 c;

    public v2(a3 a3Var) {
        this.c = a3Var;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f == 2;
    }

    @Override // org.telegram.ui.Components.dl0
    public final String F(int i10) {
        MediaController.PhotoEntry photoEntry;
        int i11 = i10 - 2;
        a3 a3Var = this.c;
        if (a3Var.W) {
            if (i11 == 0) {
                return null;
            }
            i11 = i10 - 3;
        } else if (a3Var.a0) {
            if (i11 >= 0 && i11 < a3Var.V.size()) {
                return LocaleController.formatYearMont(((s6) a3Var.V.get(i11)).d / 1000, true);
            }
            i11 -= a3Var.V.size();
        }
        ArrayList arrayList = a3Var.c0;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) a3Var.c0.get(i11)) == null) {
            return null;
        }
        long j10 = photoEntry.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j10 /= 1000;
        }
        return LocaleController.formatYearMont(j10, true);
    }

    @Override // org.telegram.ui.Components.dl0
    public final void G(tl0 tl0Var, float f10, int[] iArr) {
        int k10 = k();
        float width = (tl0Var.getWidth() - tl0Var.getPaddingLeft()) - tl0Var.getPaddingRight();
        a3 a3Var = this.c;
        m2 m2Var = a3Var.e;
        float f11 = m2Var.J;
        int i10 = (int) (((int) (width / f11)) * a3Var.L);
        int ceil = (int) Math.ceil(k10 / f11);
        float lerp = (AndroidUtilities.lerp(0, Math.max(0, r2 - ((AndroidUtilities.displaySize.y - tl0Var.getPaddingTop()) - tl0Var.getPaddingBottom())), f10) / (ceil * i10)) * ceil;
        int round = Math.round(lerp);
        iArr[0] = Math.max(0, m2Var.J * round) + 2;
        iArr[1] = tl0Var.getPaddingTop() + ((int) ((lerp - round) * i10));
    }

    @Override // org.telegram.ui.Components.dl0
    public final float H(tl0 tl0Var) {
        int k10 = k();
        float width = (tl0Var.getWidth() - tl0Var.getPaddingLeft()) - tl0Var.getPaddingRight();
        float f10 = this.c.e.J;
        return (Math.max(0, tl0Var.computeVerticalScrollOffset() - r2.getPadding()) - tl0Var.getPaddingTop()) / ((((int) Math.ceil(k10 / f10)) * ((int) (((int) (width / f10)) * r2.L))) - (AndroidUtilities.displaySize.y - tl0Var.getPaddingTop()));
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
        a3 a3Var = this.c;
        ArrayList arrayList = a3Var.c0;
        int size = arrayList == null ? 0 : arrayList.size();
        return a3Var.W ? size + 1 : a3Var.a0 ? a3Var.V.size() + size : size;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        a3 a3Var = this.c;
        ArrayList arrayList = a3Var.e0;
        ArrayList arrayList2 = a3Var.V;
        int i11 = m1Var.f;
        View view = m1Var.a;
        if (i11 == 0) {
            ((y2) view).a = i10 == 0 ? a3Var.getPadding() : -1;
            return;
        }
        if (i11 == 2) {
            x2 x2Var = (x2) view;
            boolean z4 = i10 == 2;
            boolean z10 = i10 == 4;
            x2Var.R = z4;
            x2Var.S = z10;
            x2Var.J = new u2(this, x2Var, 0);
            x2Var.K = new u2(this, x2Var, 1);
            int i12 = i10 - 2;
            if (a3Var.W) {
                if (i12 == 0) {
                    x2Var.f(-1, false, false);
                    x2Var.e(arrayList2.size(), (s6) arrayList2.get(0));
                    return;
                }
                i12 = i10 - 3;
            } else if (a3Var.a0) {
                if (i12 >= 0 && i12 < arrayList2.size()) {
                    x2Var.f(-1, false, false);
                    x2Var.e(0, (s6) arrayList2.get(i12));
                    return;
                }
                i12 -= arrayList2.size();
            }
            ArrayList arrayList3 = a3Var.c0;
            if (arrayList3 == null || i12 < 0 || i12 >= arrayList3.size()) {
                return;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) a3Var.c0.get(i12);
            x2Var.f(arrayList.indexOf(photoEntry), !arrayList.isEmpty() || a3Var.N, x2Var.P == photoEntry);
            x2Var.P = photoEntry;
            x2Var.g((photoEntry == null || !photoEntry.isVideo || photoEntry.isLivePhoto()) ? null : AndroidUtilities.formatShortDuration(photoEntry.duration));
            x2Var.C = null;
            if (photoEntry == null) {
                x2Var.L = null;
            } else if (photoEntry.isVideo) {
                StringBuilder sb = new StringBuilder();
                org.telegram.ui.b.i(R.string.AttachVideo, ", ", sb);
                sb.append(LocaleController.formatDuration(photoEntry.duration));
                x2Var.L = sb.toString();
            } else {
                x2Var.L = LocaleController.getString(R.string.AttachPhoto);
            }
            x2Var.b(photoEntry);
            x2Var.invalidate();
            if (a3Var.J) {
                x2Var.F.setOnClickListener(new r31(this, photoEntry, x2Var, 3));
            }
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        a3 a3Var = this.c;
        if (i10 == 0) {
            view = new y2(a3Var, a3Var.getContext());
        } else if (i10 == 1) {
            Context context = a3Var.getContext();
            boolean z4 = a3Var.I;
            c51 c51Var = new c51(context, 8);
            c51Var.setPadding(AndroidUtilities.dp(z4 ? 14.0f : 16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(a3Var.getTitle());
            c51Var.addView(textView, k7.c6.d(-1, -1.0f, 119, 0.0f, 0.0f, z4 ? 32.0f : 0.0f, 0.0f));
            a3Var.f0 = c51Var;
            view = c51Var;
        } else {
            view = new x2(a3Var.getContext(), a3Var.b, a3Var.L, a3Var.J);
        }
        return new fl0(view);
    }

    @Override // f2.p0
    public final void y(f2.m1 m1Var) {
        a3 a3Var = this.c;
        ArrayList arrayList = a3Var.e0;
        if (m1Var.f == 2) {
            x2 x2Var = (x2) m1Var.a;
            Object obj = x2Var.P;
            if (!(obj instanceof MediaController.PhotoEntry)) {
                x2Var.f(-1, false, false);
            } else {
                x2Var.f(arrayList.indexOf((MediaController.PhotoEntry) obj), !arrayList.isEmpty() || a3Var.N, false);
            }
        }
    }
}
