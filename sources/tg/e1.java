package tg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ha;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class e1 extends FrameLayout implements ls {
    public static final List x = Arrays.asList(new b1(0, 1, 20, 0), new b1(0, 2, 20, 40), new b1(1, 0, 0, 20), new b1(1, 2, 60, 40), new b1(2, 0, 40, 20), new b1(2, 1, 40, 60));
    public int a;
    public final ch0 b;
    public final ImageView c;
    public final ImageView d;
    public final View e;
    public final d1 f;
    public c1 h;
    public int n;
    public int r;
    public int s;
    public String w;

    public e1(Context context) {
        super(context);
        final int i7 = 0;
        this.a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.e = view;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: tg.a1
            public final /* synthetic */ e1 b;

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
                        e1 e1Var = this.b;
                        e1Var.d((e1Var.a + 1) % 3, true);
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
        addView(view, ha.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        ch0 ch0Var = new ch0(context);
        this.b = ch0Var;
        ch0Var.f(R.raw.photo_text_allign, 24, 24, null);
        zg0 animatedDrawable = ch0Var.getAnimatedDrawable();
        final int i10 = 1;
        animatedDrawable.h = true;
        animatedDrawable.P(20);
        animatedDrawable.M(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ch0Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        ch0Var.setOnClickListener(new View.OnClickListener(this) { // from class: tg.a1
            public final /* synthetic */ e1 b;

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
                        e1 e1Var = this.b;
                        e1Var.d((e1Var.a + 1) % 3, true);
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
        ch0Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        addView(ch0Var, ha.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_text_outlined);
        imageView.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        final int i11 = 2;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: tg.a1
            public final /* synthetic */ e1 b;

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
                        e1 e1Var = this.b;
                        e1Var.d((e1Var.a + 1) % 3, true);
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
        addView(imageView, ha.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setImageResource(R.drawable.msg_add);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(k6.h0(1090519039, 1, -1));
        final int i12 = 3;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: tg.a1
            public final /* synthetic */ e1 b;

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
                        e1 e1Var = this.b;
                        e1Var.d((e1Var.a + 1) % 3, true);
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
        addView(imageView2, ha.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        d1 d1Var = new d1(context);
        this.f = d1Var;
        d1Var.setCurrent(true);
        final int i13 = 4;
        d1Var.setOnClickListener(new View.OnClickListener(this) { // from class: tg.a1
            public final /* synthetic */ e1 b;

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
                        e1 e1Var = this.b;
                        e1Var.d((e1Var.a + 1) % 3, true);
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
        addView(d1Var, ha.p(-2, -2, 0.0f, 21));
    }

    public final void a(int i7) {
        if (i7 == 0) {
            i7 = R.drawable.msg_add;
        }
        if (this.s != i7) {
            this.s = i7;
            org.telegram.messenger.g0.R3(this.d, i7);
        }
    }

    public final void b(RectF rectF) {
        d1 d1Var = this.f;
        rectF.set(org.telegram.messenger.g0.L(8.0f) + d1Var.getLeft(), d1Var.getTop(), org.telegram.messenger.g0.L(8.0f) + d1Var.getRight(), d1Var.getBottom());
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

    public final void d(int i7, boolean z9) {
        int i10 = this.a;
        this.a = i7;
        List list = x;
        ch0 ch0Var = this.b;
        if (i10 == i7) {
            zg0 animatedDrawable = ch0Var.getAnimatedDrawable();
            b1 b1Var = (b1) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                b1 b1Var2 = (b1) it.next();
                if (this.a == b1Var2.b) {
                    b1Var = b1Var2;
                    break;
                }
            }
            animatedDrawable.M(b1Var.d);
            animatedDrawable.P(b1Var.d);
            if (z9) {
                this.h.c(i7);
                return;
            }
            return;
        }
        b1 b1Var3 = (b1) list.get(0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            b1 b1Var4 = (b1) it2.next();
            if (i10 == b1Var4.a && this.a == b1Var4.b) {
                b1Var3 = b1Var4;
                break;
            }
        }
        zg0 animatedDrawable2 = ch0Var.getAnimatedDrawable();
        animatedDrawable2.M(b1Var3.c);
        animatedDrawable2.P(b1Var3.d);
        animatedDrawable2.start();
        if (z9) {
            this.h.c(i7);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        if (i7 != qs.C5 || (str = this.w) == null) {
            return;
        }
        setTypeface(str);
        this.w = null;
    }

    public final void e(int i7, boolean z9) {
        if (this.n == i7) {
            return;
        }
        this.n = i7;
        int i10 = i7 != 1 ? i7 != 2 ? i7 != 3 ? R.drawable.msg_photo_text_framed : R.drawable.msg_photo_text_regular : R.drawable.msg_photo_text_framed3 : R.drawable.msg_photo_text_framed2;
        ImageView imageView = this.c;
        if (z9) {
            org.telegram.messenger.g0.R3(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
    }

    public View getColorClickableView() {
        return this.e;
    }

    public jg getEmojiButton() {
        return null;
    }

    public d1 getTypefaceCell() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.e().c(this, qs.C5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.e().n(this, qs.C5);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        this.r = getPaddingLeft();
        c(this.e);
        c(this.b);
        c(this.c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        d1 d1Var = this.f;
        d1Var.layout(measuredWidth - d1Var.getMeasuredWidth(), (getMeasuredHeight() - d1Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (d1Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            d1 d1Var = this.f;
            if (childAt == d1Var) {
                d1Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
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

    public void setDelegate(c1 c1Var) {
        this.h = c1Var;
    }

    public void setOutlineType(int i7) {
        e(i7, false);
    }

    public void setTypeface(String str) {
        this.w = str;
        d1 d1Var = this.f;
        if (d1Var == null) {
            return;
        }
        for (sg.b0 b0Var : sg.b0.c()) {
            if (b0Var.a.equals(str)) {
                d1Var.setTypeface(b0Var.d());
                String str2 = b0Var.c;
                if (str2 == null) {
                    str2 = hd.N0(b0Var.b);
                }
                d1Var.setText(str2);
                return;
            }
        }
    }

    public void setTypefaceListView(j1 j1Var) {
    }
}
