// default package

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uic extends LinearLayout {
    public HashMap a;
    public ArrayList b;
    public ArrayList c;
    public TransitionSet d;
    public boolean e;
    public boolean f;
    public Runnable h;
    public lhc n;
    public TextPaint r;

    public final void a(int i, String str, String str2) {
        HashMap hashMap = this.a;
        if (hashMap.get(str2) != null) {
            return;
        }
        tic ticVar = new tic(getContext(), this.n, i);
        ticVar.a = str2;
        int L = gm.q.x - gm.L(120.0f);
        TextView textView = ticVar.c;
        StaticLayout c = oya.c(str, textView.getPaint(), L, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, L, 10, true);
        if (c != null) {
            L = 0;
            for (int i2 = 0; i2 < c.getLineCount(); i2++) {
                L = (int) Math.max(L, Math.ceil(c.getLineWidth(i2)));
            }
        }
        textView.setMaxWidth(L);
        textView.setText(str);
        ticVar.b.setImageResource(i);
        hashMap.put(str2, ticVar);
        if (this.e) {
            this.b.add(ticVar);
        } else {
            this.f = true;
            addView(ticVar, qoe.t(-2, -2, 1, 4, 0, 0, 4));
        }
    }

    public final CharSequence b(String str) {
        return str == null ? "" : TextUtils.ellipsize(str, this.r, gm.L(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        tic ticVar = (tic) this.a.remove(str);
        this.n.m.remove(ticVar);
        if (ticVar != null) {
            if (!this.e) {
                this.f = true;
                removeView(ticVar);
            } else {
                if (this.b.remove(ticVar)) {
                    return;
                }
                this.c.add(ticVar);
            }
        }
    }

    public int getChildsHight() {
        int childCount = getChildCount();
        return hg9.y(32.0f, childCount, childCount > 0 ? gm.L(16.0f) : 0);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
