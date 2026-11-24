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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class tya extends o39 implements tjb {
    public static final rya F3 = new rya();
    public static final sya G3 = new sya();
    public final lm A3;
    public final RectF B3;
    public final RectF C3;
    public final RectF D3;
    public boolean E3;
    public float f3;
    public qya[] g3;
    public final lya h3;
    public final lm i3;
    public Drawable j3;
    public Drawable k3;
    public Paint l3;
    public final Paint m3;
    public int n3;
    public int o3;
    public p8c p3;
    public p8c q3;
    public boolean r3;
    public boolean s3;
    public si9 t3;
    public int u3;
    public p8c v3;
    public float w3;
    public ValueAnimator x3;
    public boolean y3;
    public final lm z3;

    public tya(int i, wjb wjbVar, Context context) {
        super(context, wjbVar);
        this.f3 = 6.5f;
        this.g3 = null;
        s33 s33Var = s33.h;
        this.i3 = new lm(360L, this, s33Var);
        Paint paint = new Paint(1);
        this.m3 = paint;
        this.u3 = -1;
        this.w3 = 0.0f;
        this.y3 = true;
        this.z3 = new lm(350L, this, s33Var);
        this.A3 = new lm(350L, this, s33Var);
        this.B3 = new RectF();
        this.C3 = new RectF();
        this.D3 = new RectF();
        setPadding(0, 0, gl.L(2.0f), 0);
        lya lyaVar = new lya(this);
        this.h3 = lyaVar;
        setAdapter(lyaVar);
        t26 t26Var = new t26();
        setLayoutManager(t26Var);
        t26Var.i1(0);
        setSelectorRadius(gl.L(15.0f));
        setSelectorType(1);
        int i2 = bkb.h6;
        zkb.l(this, 20, i2, wjbVar);
        paint.setColor(bkb.v0(i2, this.o2));
        setWillNotDraw(false);
        setOnItemClickListener(new f09(this, (byte) 16));
        long currentTimeMillis = System.currentTimeMillis();
        F3.c(y6c.t0, Integer.valueOf(i), new hy3(this, currentTimeMillis, (byte) 1));
    }

    public static void A1(View view, RectF rectF) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f = 1.0f;
        float width = (view.getWidth() / 2.0f) - gl.L(1.0f);
        if (view instanceof pya) {
            pya pyaVar = (pya) view;
            f = tb4.A(1.0f, pyaVar.F, 0.15f, 0.85f) * pyaVar.E;
        }
        float f2 = width * f;
        rectF.set(left - f2, top - f2, left + f2, top + f2);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (!(childAt instanceof pya)) {
            return -childAt.getLeft();
        }
        return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.n3 + (-childAt.getLeft());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoriesShownT(float f) {
        this.w3 = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof pya) {
                float s = gl.s(f, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (s > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((pya) childAt).j();
                }
                childAt.setAlpha(s);
                childAt.setScaleX(s);
                childAt.setScaleY(s);
            }
        }
        invalidate();
    }

    public boolean B1() {
        return e66.e(8200);
    }

    public final void C1(TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j) {
        qya[] qyaVarArr;
        this.g3 = new qya[tL_messages_emojiGroups.groups.size()];
        int i = 0;
        while (true) {
            int size = tL_messages_emojiGroups.groups.size();
            qyaVarArr = this.g3;
            if (i >= size) {
                break;
            }
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i);
            qya qyaVar = new qya();
            qyaVar.c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                qyaVar.a = "premium";
            } else {
                qyaVar.a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            qyaVar.b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            qyaVar.d = emojiGroup.title;
            qyaVarArr[i] = qyaVar;
            i++;
        }
        this.g3 = E1(qyaVarArr);
        this.h3.f();
        setCategoriesShownT(0.0f);
        J1(this.y3, System.currentTimeMillis() - j > 16);
    }

    public final /* synthetic */ void D1(ValueAnimator valueAnimator) {
        setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final void F1() {
        int L = (gl.L(34.0f) * this.u3) + ((-getScrollToStartWidth()) - Math.max(0, this.o3));
        scrollBy(L, 0);
        post(new kya((wv3) this, L));
    }

    public final void G1() {
        x0(-getScrollToStartWidth(), 0, s33.h);
    }

    public void H1(int i) {
        if (this.u3 < 0 && i >= 0) {
            this.A3.e(true, i);
        }
        this.u3 = i;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof pya) {
                ((pya) childAt).l(this.u3 == RecyclerView.R(childAt) - 1, true);
            }
        }
        invalidate();
    }

    public final void I1(qya qyaVar) {
        int i;
        if (this.g3 != null) {
            i = 0;
            while (true) {
                qya[] qyaVarArr = this.g3;
                if (i >= qyaVarArr.length) {
                    break;
                } else if (qyaVarArr[i] == qyaVar) {
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
        ofFloat.addUpdateListener(new gja(this, (byte) 9));
        this.x3.addListener(new ng9((Object) this, (byte) 22));
        this.x3.setInterpolator(s33.h);
        this.x3.setDuration((this.g3 == null ? 5 : r6.length) * 120);
        this.x3.start();
    }

    @Override // o39, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View E = E(motionEvent.getX(), motionEvent.getY());
            if (!(E instanceof pya) || E.getAlpha() < 0.5f) {
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
                if (childAt instanceof pya) {
                    i = Math.min(i, childAt.getLeft());
                    i2 = Math.max(i2, childAt.getRight());
                }
            }
            if (i < i2) {
                int A = (int) tb4.A(1.0f, this.w3, gl.L(32.0f) + getWidth(), i);
                int A2 = (int) tb4.A(1.0f, this.w3, gl.L(32.0f) + getWidth(), i2);
                canvas2 = canvas;
                canvas2.drawRect(A, 0.0f, A2, getHeight(), this.l3);
                if (A2 < getWidth() && (drawable2 = this.j3) != null) {
                    drawable2.setAlpha(kk7.d4);
                    Drawable drawable3 = this.j3;
                    drawable3.setBounds(A2, 0, drawable3.getIntrinsicWidth() + A2, getHeight());
                    this.j3.draw(canvas2);
                }
                e = this.z3.e(false, this.u3 < 0 ? 1.0f : 0.0f);
                int i4 = this.u3;
                lm lmVar = this.A3;
                float e2 = i4 < 0 ? lmVar.e(false, i4) : lmVar.c;
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
                        gl.X1(rectF, rectF2, f2, rectF3);
                        canvas2.drawRoundRect(rectF3, gl.L(15.0f), gl.L(15.0f), paint);
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
        lm lmVar2 = this.A3;
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

    public qya getSelectedCategory() {
        int i;
        qya[] qyaVarArr = this.g3;
        if (qyaVarArr == null || (i = this.u3) < 0 || i >= qyaVarArr.length) {
            return null;
        }
        return qyaVarArr[i];
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m0(int i) {
        boolean z;
        boolean z2;
        p8c p8cVar;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof pya) {
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
            p8c p8cVar2 = this.p3;
            if (p8cVar2 != null) {
                p8cVar2.a(Integer.valueOf(z2 ? Math.max(0, getScrollToStartWidth() - (this.n3 - this.o3)) : 0));
            }
            invalidate();
        } else if (z3 && (p8cVar = this.p3) != null) {
            p8cVar.a(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.n3 - this.o3))));
        }
        if (this.s3 != z) {
            this.s3 = z;
            p8c p8cVar3 = this.q3;
            if (p8cVar3 != null) {
                p8cVar3.a(Boolean.valueOf(z));
            }
            invalidate();
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        J1(this.y3, false);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        si9 si9Var = this.t3;
        if (si9Var != null) {
            si9Var.requestLayout();
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

    public void setOnCategoryClick(p8c p8cVar) {
        this.v3 = p8cVar;
    }

    public void setOnScrollFully(p8c p8cVar) {
        this.q3 = p8cVar;
    }

    public void setOnScrollIntoOccupiedWidth(p8c p8cVar) {
        this.p3 = p8cVar;
    }

    public void setShownButtonsAtStart(float f) {
        this.f3 = f;
    }

    @Override // tjb
    public final void updateColors() {
        try {
            this.m3.setColor(bkb.v0(bkb.h6, this.o2));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public qya[] E1(qya[] qyaVarArr) {
        return qyaVarArr;
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
