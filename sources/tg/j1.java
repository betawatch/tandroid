package tg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.na;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.zg;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class j1 extends FrameLayout implements fs {
    public static final List x = Arrays.asList(new g1(0, 1, 20, 0), new g1(0, 2, 20, 40), new g1(1, 0, 0, 20), new g1(1, 2, 60, 40), new g1(2, 0, 40, 20), new g1(2, 1, 40, 60));
    public int a;
    public final qh0 b;
    public final ImageView c;
    public final ImageView d;
    public final View e;
    public final i1 f;
    public h1 h;
    public int n;
    public int r;
    public int s;
    public String w;

    public j1(Context context) {
        super(context);
        final int i7 = 0;
        this.a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.e = view;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: tg.f1
            public final /* synthetic */ j1 b;

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
                        j1 j1Var = this.b;
                        j1Var.d((j1Var.a + 1) % 3, true);
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
        addView(view, na.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        qh0 qh0Var = new qh0(context);
        this.b = qh0Var;
        qh0Var.f(R.raw.photo_text_allign, 24, 24, null);
        nh0 animatedDrawable = qh0Var.getAnimatedDrawable();
        final int i10 = 1;
        animatedDrawable.h = true;
        animatedDrawable.P(20);
        animatedDrawable.M(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        qh0Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        qh0Var.setOnClickListener(new View.OnClickListener(this) { // from class: tg.f1
            public final /* synthetic */ j1 b;

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
                        j1 j1Var = this.b;
                        j1Var.d((j1Var.a + 1) % 3, true);
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
        qh0Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        addView(qh0Var, na.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_text_outlined);
        imageView.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        final int i11 = 2;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: tg.f1
            public final /* synthetic */ j1 b;

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
                        j1 j1Var = this.b;
                        j1Var.d((j1Var.a + 1) % 3, true);
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
        addView(imageView, na.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setImageResource(R.drawable.msg_add);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(n6.h0(1090519039, 1, -1));
        final int i12 = 3;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: tg.f1
            public final /* synthetic */ j1 b;

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
                        j1 j1Var = this.b;
                        j1Var.d((j1Var.a + 1) % 3, true);
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
        addView(imageView2, na.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        i1 i1Var = new i1(context);
        this.f = i1Var;
        i1Var.setCurrent(true);
        final int i13 = 4;
        i1Var.setOnClickListener(new View.OnClickListener(this) { // from class: tg.f1
            public final /* synthetic */ j1 b;

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
                        j1 j1Var = this.b;
                        j1Var.d((j1Var.a + 1) % 3, true);
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
        addView(i1Var, na.p(-2, -2, 0.0f, 21));
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
        i1 i1Var = this.f;
        rectF.set(org.telegram.messenger.g0.L(8.0f) + i1Var.getLeft(), i1Var.getTop(), org.telegram.messenger.g0.L(8.0f) + i1Var.getRight(), i1Var.getBottom());
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
        qh0 qh0Var = this.b;
        if (i10 == i7) {
            nh0 animatedDrawable = qh0Var.getAnimatedDrawable();
            g1 g1Var = (g1) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g1 g1Var2 = (g1) it.next();
                if (this.a == g1Var2.b) {
                    g1Var = g1Var2;
                    break;
                }
            }
            animatedDrawable.M(g1Var.d);
            animatedDrawable.P(g1Var.d);
            if (z10) {
                this.h.c(i7);
                return;
            }
            return;
        }
        g1 g1Var3 = (g1) list.get(0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            g1 g1Var4 = (g1) it2.next();
            if (i10 == g1Var4.a && this.a == g1Var4.b) {
                g1Var3 = g1Var4;
                break;
            }
        }
        nh0 animatedDrawable2 = qh0Var.getAnimatedDrawable();
        animatedDrawable2.M(g1Var3.c);
        animatedDrawable2.P(g1Var3.d);
        animatedDrawable2.start();
        if (z10) {
            this.h.c(i7);
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        if (i7 != ks.F5 || (str = this.w) == null) {
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

    public zg getEmojiButton() {
        return null;
    }

    public i1 getTypefaceCell() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.e().c(this, ks.F5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.e().n(this, ks.F5);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        this.r = getPaddingLeft();
        c(this.e);
        c(this.b);
        c(this.c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        i1 i1Var = this.f;
        i1Var.layout(measuredWidth - i1Var.getMeasuredWidth(), (getMeasuredHeight() - i1Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (i1Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            i1 i1Var = this.f;
            if (childAt == i1Var) {
                i1Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
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

    public void setDelegate(h1 h1Var) {
        this.h = h1Var;
    }

    public void setOutlineType(int i7) {
        e(i7, false);
    }

    public void setTypeface(String str) {
        this.w = str;
        i1 i1Var = this.f;
        if (i1Var == null) {
            return;
        }
        for (sg.a0 a0Var : sg.a0.c()) {
            if (a0Var.a.equals(str)) {
                i1Var.setTypeface(a0Var.d());
                String str2 = a0Var.c;
                if (str2 == null) {
                    str2 = gd.O0(a0Var.b);
                }
                i1Var.setText(str2);
                return;
            }
        }
    }

    public void setTypefaceListView(o1 o1Var) {
    }
}
