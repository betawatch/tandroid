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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class tgc extends LinearLayout {
    public HashMap a;
    public ArrayList b;
    public ArrayList c;
    public TransitionSet d;
    public boolean e;
    public boolean f;
    public Runnable h;
    public lfc n;
    public TextPaint r;

    public final void a(int i, String str, String str2) {
        HashMap hashMap = this.a;
        if (hashMap.get(str2) != null) {
            return;
        }
        sgc sgcVar = new sgc(getContext(), this.n, i);
        sgcVar.a = str2;
        int L = gl.q.x - gl.L(120.0f);
        TextView textView = sgcVar.c;
        StaticLayout c = lwa.c(str, textView.getPaint(), L, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, L, 10, true);
        if (c != null) {
            L = 0;
            for (int i2 = 0; i2 < c.getLineCount(); i2++) {
                L = (int) Math.max(L, Math.ceil(c.getLineWidth(i2)));
            }
        }
        textView.setMaxWidth(L);
        textView.setText(str);
        sgcVar.b.setImageResource(i);
        hashMap.put(str2, sgcVar);
        if (this.e) {
            this.b.add(sgcVar);
        } else {
            this.f = true;
            addView(sgcVar, nme.t(-2, -2, 1, 4, 0, 0, 4));
        }
    }

    public final CharSequence b(String str) {
        return str == null ? "" : TextUtils.ellipsize(str, this.r, gl.L(300.0f), TextUtils.TruncateAt.END);
    }

    public final void c(String str) {
        sgc sgcVar = (sgc) this.a.remove(str);
        this.n.m.remove(sgcVar);
        if (sgcVar != null) {
            if (!this.e) {
                this.f = true;
                removeView(sgcVar);
            } else {
                if (this.b.remove(sgcVar)) {
                    return;
                }
                this.c.add(sgcVar);
            }
        }
    }

    public int getChildsHight() {
        int childCount = getChildCount();
        return de9.y(32.0f, childCount, childCount > 0 ? gl.L(16.0f) : 0);
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.h = runnable;
    }
}
