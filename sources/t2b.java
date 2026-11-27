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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class t2b extends d79 implements snb {
    public static final r2b F3 = new r2b();
    public static final s2b G3 = new s2b();
    public final mm A3;
    public final RectF B3;
    public final RectF C3;
    public final RectF D3;
    public boolean E3;
    public float f3;
    public q2b[] g3;
    public final l2b h3;
    public final mm i3;
    public Drawable j3;
    public Drawable k3;
    public Paint l3;
    public final Paint m3;
    public int n3;
    public int o3;
    public pcc p3;
    public pcc q3;
    public boolean r3;
    public boolean s3;
    public nf9 t3;
    public int u3;
    public pcc v3;
    public float w3;
    public ValueAnimator x3;
    public boolean y3;
    public final mm z3;

    public t2b(int i, vnb vnbVar, Context context) {
        super(context, vnbVar);
        this.f3 = 6.5f;
        this.g3 = null;
        k43 k43Var = k43.h;
        this.i3 = new mm(360L, this, k43Var);
        Paint paint = new Paint(1);
        this.m3 = paint;
        this.u3 = -1;
        this.w3 = 0.0f;
        this.y3 = true;
        this.z3 = new mm(350L, this, k43Var);
        this.A3 = new mm(350L, this, k43Var);
        this.B3 = new RectF();
        this.C3 = new RectF();
        this.D3 = new RectF();
        setPadding(0, 0, hl.L(2.0f), 0);
        l2b l2bVar = new l2b(this);
        this.h3 = l2bVar;
        setAdapter(l2bVar);
        x46 x46Var = new x46();
        setLayoutManager(x46Var);
        x46Var.i1(0);
        setSelectorRadius(hl.L(15.0f));
        setSelectorType(1);
        int i2 = aob.i6;
        yob.l(this, 20, i2, vnbVar);
        paint.setColor(aob.v0(i2, this.o2));
        setWillNotDraw(false);
        setOnItemClickListener(new t39(this, (byte) 16));
        long currentTimeMillis = System.currentTimeMillis();
        F3.c(yac.t0, Integer.valueOf(i), new cz3(this, currentTimeMillis, (byte) 1));
    }

    public static void B1(View view, RectF rectF) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f = 1.0f;
        float width = (view.getWidth() / 2.0f) - hl.L(1.0f);
        if (view instanceof p2b) {
            p2b p2bVar = (p2b) view;
            f = qd4.A(1.0f, p2bVar.F, 0.15f, 0.85f) * p2bVar.E;
        }
        float f2 = width * f;
        rectF.set(left - f2, top - f2, left + f2, top + f2);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (!(childAt instanceof p2b)) {
            return -childAt.getLeft();
        }
        return Math.max(0, getHeight() * (RecyclerView.S(childAt) - 1)) + this.n3 + (-childAt.getLeft());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoriesShownT(float f) {
        this.w3 = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof p2b) {
                float s = hl.s(f, (getChildCount() - 1) - RecyclerView.S(childAt), getChildCount() - 1, 3.0f);
                if (s > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((p2b) childAt).j();
                }
                childAt.setAlpha(s);
                childAt.setScaleX(s);
                childAt.setScaleY(s);
            }
        }
        invalidate();
    }

    public boolean C1() {
        return i86.e(8200);
    }

    public final void D1(TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j) {
        q2b[] q2bVarArr;
        this.g3 = new q2b[tL_messages_emojiGroups.groups.size()];
        int i = 0;
        while (true) {
            int size = tL_messages_emojiGroups.groups.size();
            q2bVarArr = this.g3;
            if (i >= size) {
                break;
            }
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i);
            q2b q2bVar = new q2b();
            q2bVar.c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                q2bVar.a = "premium";
            } else {
                q2bVar.a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            q2bVar.b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            q2bVar.d = emojiGroup.title;
            q2bVarArr[i] = q2bVar;
            i++;
        }
        this.g3 = F1(q2bVarArr);
        this.h3.f();
        setCategoriesShownT(0.0f);
        K1(this.y3, System.currentTimeMillis() - j > 16);
    }

    public final /* synthetic */ void E1(ValueAnimator valueAnimator) {
        setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final void G1() {
        int L = (hl.L(34.0f) * this.u3) + ((-getScrollToStartWidth()) - Math.max(0, this.o3));
        scrollBy(L, 0);
        post(new uoa((rw3) this, L));
    }

    public final void H1() {
        y0(-getScrollToStartWidth(), 0, k43.h);
    }

    public void I1(int i) {
        if (this.u3 < 0 && i >= 0) {
            this.A3.e(true, i);
        }
        this.u3 = i;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof p2b) {
                ((p2b) childAt).l(this.u3 == RecyclerView.S(childAt) - 1, true);
            }
        }
        invalidate();
    }

    public final void J1(q2b q2bVar) {
        int i;
        if (this.g3 != null) {
            i = 0;
            while (true) {
                q2b[] q2bVarArr = this.g3;
                if (i >= q2bVarArr.length) {
                    break;
                } else if (q2bVarArr[i] == q2bVar) {
                    break;
                } else {
                    i++;
                }
            }
            I1(i);
        }
        i = -1;
        I1(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void K1(boolean z, boolean z2) {
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
        ofFloat.addUpdateListener(new ija(this, (byte) 11));
        this.x3.addListener(new po9((Object) this, (byte) 21));
        this.x3.setInterpolator(k43.h);
        this.x3.setDuration((this.g3 == null ? 5 : r6.length) * 120);
        this.x3.start();
    }

    @Override // d79, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View F = F(motionEvent.getX(), motionEvent.getY());
            if (!(F instanceof p2b) || F.getAlpha() < 0.5f) {
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
                if (childAt instanceof p2b) {
                    i = Math.min(i, childAt.getLeft());
                    i2 = Math.max(i2, childAt.getRight());
                }
            }
            if (i < i2) {
                int A = (int) qd4.A(1.0f, this.w3, hl.L(32.0f) + getWidth(), i);
                int A2 = (int) qd4.A(1.0f, this.w3, hl.L(32.0f) + getWidth(), i2);
                canvas2 = canvas;
                canvas2.drawRect(A, 0.0f, A2, getHeight(), this.l3);
                if (A2 < getWidth() && (drawable2 = this.j3) != null) {
                    drawable2.setAlpha(jn7.d4);
                    Drawable drawable3 = this.j3;
                    drawable3.setBounds(A2, 0, drawable3.getIntrinsicWidth() + A2, getHeight());
                    this.j3.draw(canvas2);
                }
                e = this.z3.e(false, this.u3 < 0 ? 1.0f : 0.0f);
                int i4 = this.u3;
                mm mmVar = this.A3;
                float e2 = i4 < 0 ? mmVar.e(false, i4) : mmVar.c;
                if (e > 0.0f) {
                    float f = e2 + 1.0f;
                    double d = f;
                    int max = Math.max(1, (int) Math.floor(d));
                    int max2 = Math.max(1, (int) Math.ceil(d));
                    View view = null;
                    View view2 = null;
                    for (int i5 = 0; i5 < getChildCount(); i5++) {
                        View childAt2 = getChildAt(i5);
                        int S = RecyclerView.S(childAt2);
                        if (S == max) {
                            view = childAt2;
                        }
                        if (S == max2) {
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
                        B1(view, rectF);
                        RectF rectF2 = this.C3;
                        B1(view2, rectF2);
                        RectF rectF3 = this.D3;
                        hl.X1(rectF, rectF2, f2, rectF3);
                        canvas2.drawRoundRect(rectF3, hl.L(15.0f), hl.L(15.0f), paint);
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
        mm mmVar2 = this.A3;
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

    public q2b getSelectedCategory() {
        int i;
        q2b[] q2bVarArr = this.g3;
        if (q2bVarArr == null || (i = this.u3) < 0 || i >= q2bVarArr.length) {
            return null;
        }
        return q2bVarArr[i];
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void n0(int i) {
        boolean z;
        boolean z2;
        pcc pccVar;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof p2b) {
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
            pcc pccVar2 = this.p3;
            if (pccVar2 != null) {
                pccVar2.a(Integer.valueOf(z2 ? Math.max(0, getScrollToStartWidth() - (this.n3 - this.o3)) : 0));
            }
            invalidate();
        } else if (z3 && (pccVar = this.p3) != null) {
            pccVar.a(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.n3 - this.o3))));
        }
        if (this.s3 != z) {
            this.s3 = z;
            pcc pccVar3 = this.q3;
            if (pccVar3 != null) {
                pccVar3.a(Boolean.valueOf(z));
            }
            invalidate();
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        K1(this.y3, false);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        nf9 nf9Var = this.t3;
        if (nf9Var != null) {
            nf9Var.requestLayout();
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

    public void setOnCategoryClick(pcc pccVar) {
        this.v3 = pccVar;
    }

    public void setOnScrollFully(pcc pccVar) {
        this.q3 = pccVar;
    }

    public void setOnScrollIntoOccupiedWidth(pcc pccVar) {
        this.p3 = pccVar;
    }

    public void setShownButtonsAtStart(float f) {
        this.f3 = f;
    }

    @Override // snb
    public final void updateColors() {
        try {
            this.m3.setColor(aob.v0(aob.i6, this.o2));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public q2b[] F1(q2b[] q2bVarArr) {
        return q2bVarArr;
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
