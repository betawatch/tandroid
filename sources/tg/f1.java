package tg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ma;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.rh0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class f1 extends FrameLayout implements gs {
    public static final List x = Arrays.asList(new c1(0, 1, 20, 0), new c1(0, 2, 20, 40), new c1(1, 0, 0, 20), new c1(1, 2, 60, 40), new c1(2, 0, 40, 20), new c1(2, 1, 40, 60));
    public int a;
    public final rh0 b;
    public final ImageView c;
    public final ImageView d;
    public final View e;
    public final e1 f;
    public d1 h;
    public int n;
    public int r;
    public int s;
    public String w;

    public f1(Context context) {
        super(context);
        final int i7 = 0;
        this.a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.e = view;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: tg.b1
            public final /* synthetic */ f1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i7) {
                    case 0:
                        this.b.h.a();
                        break;
                    case 1:
                        f1 f1Var = this.b;
                        f1Var.d((f1Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.b();
                        break;
                    case 3:
                        this.b.h.t();
                        break;
                    default:
                        this.b.h.D();
                        break;
                }
            }
        });
        addView(view, ma.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        rh0 rh0Var = new rh0(context);
        this.b = rh0Var;
        rh0Var.f(R.raw.photo_text_allign, 24, 24, null);
        oh0 animatedDrawable = rh0Var.getAnimatedDrawable();
        final int i10 = 1;
        animatedDrawable.h = true;
        animatedDrawable.P(20);
        animatedDrawable.M(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        rh0Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        rh0Var.setOnClickListener(new View.OnClickListener(this) { // from class: tg.b1
            public final /* synthetic */ f1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        this.b.h.a();
                        break;
                    case 1:
                        f1 f1Var = this.b;
                        f1Var.d((f1Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.b();
                        break;
                    case 3:
                        this.b.h.t();
                        break;
                    default:
                        this.b.h.D();
                        break;
                }
            }
        });
        rh0Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        addView(rh0Var, ma.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_text_outlined);
        imageView.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        final int i11 = 2;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: tg.b1
            public final /* synthetic */ f1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        this.b.h.a();
                        break;
                    case 1:
                        f1 f1Var = this.b;
                        f1Var.d((f1Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.b();
                        break;
                    case 3:
                        this.b.h.t();
                        break;
                    default:
                        this.b.h.D();
                        break;
                }
            }
        });
        addView(imageView, ma.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setImageResource(R.drawable.msg_add);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(m6.h0(1090519039, 1, -1));
        final int i12 = 3;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: tg.b1
            public final /* synthetic */ f1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.b.h.a();
                        break;
                    case 1:
                        f1 f1Var = this.b;
                        f1Var.d((f1Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.b();
                        break;
                    case 3:
                        this.b.h.t();
                        break;
                    default:
                        this.b.h.D();
                        break;
                }
            }
        });
        imageView2.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        addView(imageView2, ma.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        e1 e1Var = new e1(context);
        this.f = e1Var;
        e1Var.setCurrent(true);
        final int i13 = 4;
        e1Var.setOnClickListener(new View.OnClickListener(this) { // from class: tg.b1
            public final /* synthetic */ f1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.b.h.a();
                        break;
                    case 1:
                        f1 f1Var = this.b;
                        f1Var.d((f1Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.b();
                        break;
                    case 3:
                        this.b.h.t();
                        break;
                    default:
                        this.b.h.D();
                        break;
                }
            }
        });
        addView(e1Var, ma.p(-2, -2, 0.0f, 21));
    }

    public final void a(int i7) {
        if (i7 == 0) {
            i7 = R.drawable.msg_add;
        }
        if (this.s != i7) {
            this.s = i7;
            org.telegram.messenger.g0.P3(this.d, i7);
        }
    }

    public final void b(RectF rectF) {
        e1 e1Var = this.f;
        rectF.set(org.telegram.messenger.g0.L(8.0f) + e1Var.getLeft(), e1Var.getTop(), org.telegram.messenger.g0.L(8.0f) + e1Var.getRight(), e1Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i7 = this.r + layoutParams.leftMargin;
            this.r = i7;
            view.layout(i7, (getMeasuredHeight() - layoutParams.height) / 2, this.r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.r = layoutParams.width + layoutParams.rightMargin + this.r;
        }
    }

    public final void d(int i7, boolean z10) {
        int i10 = this.a;
        this.a = i7;
        List list = x;
        rh0 rh0Var = this.b;
        if (i10 == i7) {
            oh0 animatedDrawable = rh0Var.getAnimatedDrawable();
            c1 c1Var = (c1) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                c1 c1Var2 = (c1) it.next();
                if (this.a == c1Var2.b) {
                    c1Var = c1Var2;
                    break;
                }
            }
            animatedDrawable.M(c1Var.d);
            animatedDrawable.P(c1Var.d);
            if (z10) {
                this.h.c(i7);
                return;
            }
            return;
        }
        c1 c1Var3 = (c1) list.get(0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            c1 c1Var4 = (c1) it2.next();
            if (i10 == c1Var4.a && this.a == c1Var4.b) {
                c1Var3 = c1Var4;
                break;
            }
        }
        oh0 animatedDrawable2 = rh0Var.getAnimatedDrawable();
        animatedDrawable2.M(c1Var3.c);
        animatedDrawable2.P(c1Var3.d);
        animatedDrawable2.start();
        if (z10) {
            this.h.c(i7);
        }
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        if (i7 != ls.F5 || (str = this.w) == null) {
            return;
        }
        setTypeface(str);
        this.w = null;
    }

    public final void e(int i7, boolean z10) {
        if (this.n == i7) {
            return;
        }
        this.n = i7;
        int i10 = i7 != 1 ? i7 != 2 ? i7 != 3 ? R.drawable.msg_photo_text_framed : R.drawable.msg_photo_text_regular : R.drawable.msg_photo_text_framed3 : R.drawable.msg_photo_text_framed2;
        ImageView imageView = this.c;
        if (z10) {
            org.telegram.messenger.g0.P3(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
    }

    public View getColorClickableView() {
        return this.e;
    }

    public ah getEmojiButton() {
        return null;
    }

    public e1 getTypefaceCell() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ls.e().c(this, ls.F5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ls.e().n(this, ls.F5);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        this.r = getPaddingLeft();
        c(this.e);
        c(this.b);
        c(this.c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        e1 e1Var = this.f;
        e1Var.layout(measuredWidth - e1Var.getMeasuredWidth(), (getMeasuredHeight() - e1Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (e1Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            e1 e1Var = this.f;
            if (childAt == e1Var) {
                e1Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
            } else {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                paddingLeft -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setAlignment(int i7) {
        d(i7, false);
    }

    public void setDelegate(d1 d1Var) {
        this.h = d1Var;
    }

    public void setOutlineType(int i7) {
        e(i7, false);
    }

    public void setTypeface(String str) {
        this.w = str;
        e1 e1Var = this.f;
        if (e1Var == null) {
            return;
        }
        for (sg.a0 a0Var : sg.a0.c()) {
            if (a0Var.a.equals(str)) {
                e1Var.setTypeface(a0Var.d());
                String str2 = a0Var.c;
                if (str2 == null) {
                    str2 = hd.O0(a0Var.b);
                }
                e1Var.setText(str2);
                return;
            }
        }
    }

    public void setTypefaceListView(k1 k1Var) {
    }
}
