// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class u0b extends r59 implements vlb {
    public static final s0b F3 = new s0b();
    public static final t0b G3 = new t0b();
    public final ln A3;
    public final RectF B3;
    public final RectF C3;
    public final RectF D3;
    public boolean E3;
    public float f3;
    public r0b[] g3;
    public final m0b h3;
    public final ln i3;
    public Drawable j3;
    public Drawable k3;
    public Paint l3;
    public final Paint m3;
    public int n3;
    public int o3;
    public qac p3;
    public qac q3;
    public boolean r3;
    public boolean s3;
    public xd9 t3;
    public int u3;
    public qac v3;
    public float w3;
    public ValueAnimator x3;
    public boolean y3;
    public final ln z3;

    public u0b(int i, ylb ylbVar, Context context) {
        super(context, ylbVar);
        this.f3 = 6.5f;
        this.g3 = null;
        d53 d53Var = d53.h;
        this.i3 = new ln(360L, this, d53Var);
        Paint paint = new Paint(1);
        this.m3 = paint;
        this.u3 = -1;
        this.w3 = 0.0f;
        this.y3 = true;
        this.z3 = new ln(350L, this, d53Var);
        this.A3 = new ln(350L, this, d53Var);
        this.B3 = new RectF();
        this.C3 = new RectF();
        this.D3 = new RectF();
        setPadding(0, 0, gm.L(2.0f), 0);
        m0b m0bVar = new m0b(this);
        this.h3 = m0bVar;
        setAdapter(m0bVar);
        u46 u46Var = new u46();
        setLayoutManager(u46Var);
        u46Var.i1(0);
        setSelectorRadius(gm.L(15.0f));
        setSelectorType(1);
        int i2 = cmb.h6;
        anb.l(this, 20, i2, ylbVar);
        paint.setColor(cmb.v0(i2, this.o2));
        setWillNotDraw(false);
        setOnItemClickListener(new s19(this, (byte) 17));
        long currentTimeMillis = System.currentTimeMillis();
        F3.c(z8c.t0, Integer.valueOf(i), new rz3(this, currentTimeMillis, (byte) 1));
    }

    public static void A1(View view, RectF rectF) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f = 1.0f;
        float width = (view.getWidth() / 2.0f) - gm.L(1.0f);
        if (view instanceof q0b) {
            q0b q0bVar = (q0b) view;
            f = td4.A(1.0f, q0bVar.F, 0.15f, 0.85f) * q0bVar.E;
        }
        float f2 = width * f;
        rectF.set(left - f2, top - f2, left + f2, top + f2);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (!(childAt instanceof q0b)) {
            return -childAt.getLeft();
        }
        return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.n3 + (-childAt.getLeft());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoriesShownT(float f) {
        this.w3 = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof q0b) {
                float s = gm.s(f, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (s > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((q0b) childAt).j();
                }
                childAt.setAlpha(s);
                childAt.setScaleX(s);
                childAt.setScaleY(s);
            }
        }
        invalidate();
    }

    public boolean B1() {
        return e86.e(8200);
    }

    public final void C1(TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j) {
        r0b[] r0bVarArr;
        this.g3 = new r0b[tL_messages_emojiGroups.groups.size()];
        int i = 0;
        while (true) {
            int size = tL_messages_emojiGroups.groups.size();
            r0bVarArr = this.g3;
            if (i >= size) {
                break;
            }
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i);
            r0b r0bVar = new r0b();
            r0bVar.c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                r0bVar.a = "premium";
            } else {
                r0bVar.a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            r0bVar.b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            r0bVar.d = emojiGroup.title;
            r0bVarArr[i] = r0bVar;
            i++;
        }
        this.g3 = E1(r0bVarArr);
        this.h3.f();
        setCategoriesShownT(0.0f);
        J1(this.y3, System.currentTimeMillis() - j > 16);
    }

    public final /* synthetic */ void D1(ValueAnimator valueAnimator) {
        setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final void F1() {
        int L = (gm.L(34.0f) * this.u3) + ((-getScrollToStartWidth()) - Math.max(0, this.o3));
        scrollBy(L, 0);
        post(new nsa((hx3) this, L));
    }

    public final void G1() {
        x0(-getScrollToStartWidth(), 0, d53.h);
    }

    public void H1(int i) {
        if (this.u3 < 0 && i >= 0) {
            this.A3.e(true, i);
        }
        this.u3 = i;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof q0b) {
                ((q0b) childAt).l(this.u3 == RecyclerView.R(childAt) - 1, true);
            }
        }
        invalidate();
    }

    public final void I1(r0b r0bVar) {
        int i;
        if (this.g3 != null) {
            i = 0;
            while (true) {
                r0b[] r0bVarArr = this.g3;
                if (i >= r0bVarArr.length) {
                    break;
                } else if (r0bVarArr[i] == r0bVar) {
                    break;
                } else {
                    i++;
                }
            }
            H1(i);
        }
        i = -1;
        H1(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void J1(boolean z, boolean z2) {
        this.y3 = z;
        ?? r5 = z;
        if (this.g3 == null) {
            r5 = 0;
        }
        if (this.w3 == ((float) r5)) {
            return;
        }
        ValueAnimator valueAnimator = this.x3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.x3 = null;
        }
        if (!z2) {
            setCategoriesShownT(r5 != 0 ? 1.0f : 0.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w3, r5 != 0 ? 1.0f : 0.0f);
        this.x3 = ofFloat;
        ofFloat.addUpdateListener(new rha(this, (byte) 11));
        this.x3.addListener(new c39((Object) this, (byte) 24));
        this.x3.setInterpolator(d53.h);
        this.x3.setDuration((this.g3 == null ? 5 : r6.length) * 120);
        this.x3.start();
    }

    @Override // r59, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View E = E(motionEvent.getX(), motionEvent.getY());
            if (!(E instanceof q0b) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008f  */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float e;
        Drawable drawable;
        Drawable drawable2;
        if (this.l3 != null) {
            int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i2 = TLObject.FLAG_31;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt instanceof q0b) {
                    i = Math.min(i, childAt.getLeft());
                    i2 = Math.max(i2, childAt.getRight());
                }
            }
            if (i < i2) {
                int A = (int) td4.A(1.0f, this.w3, gm.L(32.0f) + getWidth(), i);
                int A2 = (int) td4.A(1.0f, this.w3, gm.L(32.0f) + getWidth(), i2);
                canvas2 = canvas;
                canvas2.drawRect(A, 0.0f, A2, getHeight(), this.l3);
                if (A2 < getWidth() && (drawable2 = this.j3) != null) {
                    drawable2.setAlpha(nm7.d4);
                    Drawable drawable3 = this.j3;
                    drawable3.setBounds(A2, 0, drawable3.getIntrinsicWidth() + A2, getHeight());
                    this.j3.draw(canvas2);
                }
                e = this.z3.e(false, this.u3 < 0 ? 1.0f : 0.0f);
                int i4 = this.u3;
                ln lnVar = this.A3;
                float e2 = i4 < 0 ? lnVar.e(false, i4) : lnVar.c;
                if (e > 0.0f) {
                    float f = e2 + 1.0f;
                    double d = f;
                    int max = Math.max(1, (int) Math.floor(d));
                    int max2 = Math.max(1, (int) Math.ceil(d));
                    View view = null;
                    View view2 = null;
                    for (int i5 = 0; i5 < getChildCount(); i5++) {
                        View childAt2 = getChildAt(i5);
                        int R = RecyclerView.R(childAt2);
                        if (R == max) {
                            view = childAt2;
                        }
                        if (R == max2) {
                            view2 = childAt2;
                        }
                        if (view != null && view2 != null) {
                            break;
                        }
                    }
                    Paint paint = this.m3;
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (alpha * e));
                    if (view != null && view2 != null) {
                        float f2 = max == max2 ? 0.5f : (f - max) / (max2 - max);
                        RectF rectF = this.B3;
                        A1(view, rectF);
                        RectF rectF2 = this.C3;
                        A1(view2, rectF2);
                        RectF rectF3 = this.D3;
                        gm.X1(rectF, rectF2, f2, rectF3);
                        canvas2.drawRoundRect(rectF3, gm.L(15.0f), gm.L(15.0f), paint);
                    }
                    paint.setAlpha(alpha);
                }
                super.draw(canvas2);
                drawable = this.j3;
                if (drawable == null) {
                    drawable.setAlpha((int) (this.i3.e(false, (canScrollHorizontally(-1) && this.s3) ? 1.0f : 0.0f) * 255.0f * this.w3));
                    if (this.j3.getAlpha() > 0) {
                        Drawable drawable4 = this.j3;
                        drawable4.setBounds(0, 0, drawable4.getIntrinsicWidth(), getHeight());
                        this.j3.draw(canvas2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        e = this.z3.e(false, this.u3 < 0 ? 1.0f : 0.0f);
        int i42 = this.u3;
        ln lnVar2 = this.A3;
        if (i42 < 0) {
        }
        if (e > 0.0f) {
        }
        super.draw(canvas2);
        drawable = this.j3;
        if (drawable == null) {
        }
    }

    public int getCategoryIndex() {
        return this.u3;
    }

    public r0b getSelectedCategory() {
        int i;
        r0b[] r0bVarArr = this.g3;
        if (r0bVarArr == null || (i = this.u3) < 0 || i >= r0bVarArr.length) {
            return null;
        }
        return r0bVarArr[i];
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m0(int i) {
        boolean z;
        boolean z2;
        qac qacVar;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof q0b) {
                z = true;
            } else {
                z2 = childAt.getRight() <= this.o3;
                z = false;
            }
        } else {
            z = false;
            z2 = false;
        }
        boolean z3 = this.r3;
        if (z3 != z2) {
            this.r3 = z2;
            qac qacVar2 = this.p3;
            if (qacVar2 != null) {
                qacVar2.a(Integer.valueOf(z2 ? Math.max(0, getScrollToStartWidth() - (this.n3 - this.o3)) : 0));
            }
            invalidate();
        } else if (z3 && (qacVar = this.p3) != null) {
            qacVar.a(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.n3 - this.o3))));
        }
        if (this.s3 != z) {
            this.s3 = z;
            qac qacVar3 = this.q3;
            if (qacVar3 != null) {
                qacVar3.a(Boolean.valueOf(z));
            }
            invalidate();
        }
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        J1(this.y3, false);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        xd9 xd9Var = this.t3;
        if (xd9Var != null) {
            xd9Var.requestLayout();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Paint paint = this.l3;
        if (paint == null) {
            paint = new Paint(1);
            this.l3 = paint;
        }
        paint.setColor(i);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.j3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.k3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i, mode));
    }

    public void setDontOccupyWidth(int i) {
        this.o3 = i;
    }

    public void setOnCategoryClick(qac qacVar) {
        this.v3 = qacVar;
    }

    public void setOnScrollFully(qac qacVar) {
        this.q3 = qacVar;
    }

    public void setOnScrollIntoOccupiedWidth(qac qacVar) {
        this.p3 = qacVar;
    }

    public void setShownButtonsAtStart(float f) {
        this.f3 = f;
    }

    @Override // vlb
    public final void updateColors() {
        try {
            this.m3.setColor(cmb.v0(cmb.h6, this.o2));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public r0b[] E1(r0b[] r0bVarArr) {
        return r0bVarArr;
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
