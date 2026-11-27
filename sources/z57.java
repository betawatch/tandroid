// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class z57 extends FrameLayout implements fn7, snb {
    public static final w57 n;
    public static final w57 r;
    public final int a;
    public final de0 b;
    public final ema c;
    public final TextView d;
    public final rb0 e;
    public final c2b f;
    public TLObject h;

    static {
        int i = aob.y6;
        n = new w57(R.drawable.msg_mini_checks, i);
        r = new w57(R.drawable.mini_checklist_done_outline, i);
    }

    public z57(Context context) {
        super(context);
        this.a = yac.t0;
        this.e = new rb0((vnb) null);
        de0 de0Var = new de0(context);
        this.b = de0Var;
        de0Var.setRoundRadius(hl.L(18.0f));
        ema emaVar = new ema(context);
        this.c = emaVar;
        emaVar.setTextSize(16);
        emaVar.setEllipsizeByGradient(!ob6.a0);
        emaVar.setImportantForAccessibility(2);
        yob.W(emaVar, aob.E8, null);
        emaVar.setGravity(ob6.a0 ? 5 : 3);
        this.f = new c2b(this);
        emaVar.setDrawablePadding(hl.L(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        yob.X(textView, aob.y6, null);
        textView.setGravity(ob6.a0 ? 5 : 3);
        if (ob6.a0) {
            addView(de0Var, tre.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(emaVar, tre.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, tre.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
        } else {
            addView(de0Var, tre.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            addView(emaVar, tre.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
            addView(textView, tre.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
        }
    }

    public final void a(TLObject tLObject, int i, boolean z) {
        this.h = tLObject;
        ul a = this.f.a(tLObject, aob.w0(null, aob.z9, false), false);
        ema emaVar = this.c;
        emaVar.i(a);
        if (tLObject != null) {
            rb0 rb0Var = this.e;
            rb0Var.o(tLObject);
            this.b.m(jn5.m(this.a, 1, tLObject), "50_50", rb0Var, tLObject);
            emaVar.l(lv2.o(tLObject), false);
        }
        TextView textView = this.d;
        if (i <= 0) {
            textView.setVisibility(8);
            emaVar.setTranslationY(hl.L(9.0f));
        } else {
            textView.setText(TextUtils.concat((z ? r : n).a(getContext(), null), ob6.O(i)));
            textView.setVisibility(0);
            emaVar.setTranslationY(0.0f);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.z9));
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.p5) {
            TLRPC.User user = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            TLRPC.User user2 = tLObject instanceof TLRPC.User ? (TLRPC.User) tLObject : null;
            if (user2 == null || user == null || user2.id != user.id) {
                return;
            }
            this.h = user;
            this.c.i(this.f.a(user, aob.w0(null, aob.z9, false), true));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f.a.a();
        jn7.f(this.a).b(this, jn7.p5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.a.b();
        jn7.f(this.a).n(this, jn7.p5);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String a0 = ob6.a0("AccDescrPersonHasSeen", null, 2131754807, this.c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder l = c00.l(a0, " ");
            l.append((Object) textView.getText());
            a0 = l.toString();
        }
        accessibilityNodeInfo.setText(a0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
    }

    @Override // snb
    public final void updateColors() {
        c2b c2bVar = this.f;
        if (c2bVar != null) {
            try {
                ul ulVar = c2bVar.a;
                if (ulVar != null) {
                    int w0 = aob.w0(null, aob.z9, false);
                    Integer num = ulVar.G;
                    if (num == null || num.intValue() == w0) {
                        return;
                    }
                    ulVar.k(Integer.valueOf(w0));
                    ema emaVar = this.c;
                    if (emaVar != null) {
                        emaVar.invalidate();
                    }
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }
}
