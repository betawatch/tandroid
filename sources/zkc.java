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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class zkc extends LinearLayout {
    public HashMap a;
    public ArrayList b;
    public ArrayList c;
    public TransitionSet d;
    public boolean e;
    public boolean f;
    public Runnable h;
    public kjc n;
    public TextPaint r;

    public final void a(int i, String str, String str2) {
        HashMap hashMap = this.a;
        if (hashMap.get(str2) != null) {
            return;
        }
        ykc ykcVar = new ykc(getContext(), this.n, i);
        ykcVar.a = str2;
        int L = hl.q.x - hl.L(120.0f);
        TextView textView = ykcVar.c;
        StaticLayout c = o0b.c(str, textView.getPaint(), L, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, L, 10, true);
        if (c != null) {
            L = 0;
            for (int i2 = 0; i2 < c.getLineCount(); i2++) {
                L = (int) Math.max(L, Math.ceil(c.getLineWidth(i2)));
            }
        }
        textView.setMaxWidth(L);
        textView.setText(str);
        ykcVar.b.setImageResource(i);
        hashMap.put(str2, ykcVar);
        if (this.e) {
            this.b.add(ykcVar);
        } else {
            this.f = true;
            addView(ykcVar, tre.t(-2, -2, 1, 4, 0, 0, 4));
        }
    }

    public final CharSequence b(String str) {
        return str == null ? "" : TextUtils.ellipsize(str, this.r, hl.L(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        ykc ykcVar = (ykc) this.a.remove(str);
        this.n.m.remove(ykcVar);
        if (ykcVar != null) {
            if (!this.e) {
                this.f = true;
                removeView(ykcVar);
            } else {
                if (this.b.remove(ykcVar)) {
                    return;
                }
                this.c.add(ykcVar);
            }
        }
    }

    public int getChildsHight() {
        int childCount = getChildCount();
        return uh9.y(32.0f, childCount, childCount > 0 ? hl.L(16.0f) : 0);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
