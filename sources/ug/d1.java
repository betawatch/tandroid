package ug;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.hg;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d1 extends FrameLayout implements cs {
    public static final List x = Arrays.asList(new a1(0, 1, 20, 0), new a1(0, 2, 20, 40), new a1(1, 0, 0, 20), new a1(1, 2, 60, 40), new a1(2, 0, 40, 20), new a1(2, 1, 40, 60));
    public int a;
    public final fh0 b;
    public final ImageView c;
    public final ImageView d;
    public final View e;
    public final c1 f;
    public b1 h;
    public int n;
    public int r;
    public int s;
    public String w;

    public d1(Context context) {
        super(context);
        final int i3 = 0;
        this.a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.e = view;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: ug.z0
            public final /* synthetic */ d1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i3) {
                    case 0:
                        this.b.h.a();
                        break;
                    case 1:
                        d1 d1Var = this.b;
                        d1Var.d((d1Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.b();
                        break;
                    case 3:
                        this.b.h.u();
                        break;
                    default:
                        this.b.h.D();
                        break;
                }
            }
        });
        addView(view, mf.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        fh0 fh0Var = new fh0(context);
        this.b = fh0Var;
        fh0Var.f(R.raw.photo_text_allign, 24, 24, null);
        ch0 animatedDrawable = fh0Var.getAnimatedDrawable();
        final int i10 = 1;
        animatedDrawable.h = true;
        animatedDrawable.P(20);
        animatedDrawable.M(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        fh0Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        fh0Var.setOnClickListener(new View.OnClickListener(this) { // from class: ug.z0
            public final /* synthetic */ d1 b;

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
                        d1 d1Var = this.b;
                        d1Var.d((d1Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.b();
                        break;
                    case 3:
                        this.b.h.u();
                        break;
                    default:
                        this.b.h.D();
                        break;
                }
            }
        });
        fh0Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        addView(fh0Var, mf.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_text_outlined);
        imageView.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        final int i11 = 2;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: ug.z0
            public final /* synthetic */ d1 b;

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
                        d1 d1Var = this.b;
                        d1Var.d((d1Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.b();
                        break;
                    case 3:
                        this.b.h.u();
                        break;
                    default:
                        this.b.h.D();
                        break;
                }
            }
        });
        addView(imageView, mf.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setImageResource(R.drawable.msg_add);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(k6.h0(1090519039, 1, -1));
        final int i12 = 3;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: ug.z0
            public final /* synthetic */ d1 b;

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
                        d1 d1Var = this.b;
                        d1Var.d((d1Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.b();
                        break;
                    case 3:
                        this.b.h.u();
                        break;
                    default:
                        this.b.h.D();
                        break;
                }
            }
        });
        imageView2.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        addView(imageView2, mf.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        c1 c1Var = new c1(context);
        this.f = c1Var;
        c1Var.setCurrent(true);
        final int i13 = 4;
        c1Var.setOnClickListener(new View.OnClickListener(this) { // from class: ug.z0
            public final /* synthetic */ d1 b;

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
                        d1 d1Var = this.b;
                        d1Var.d((d1Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.b();
                        break;
                    case 3:
                        this.b.h.u();
                        break;
                    default:
                        this.b.h.D();
                        break;
                }
            }
        });
        addView(c1Var, mf.p(-2, -2, 0.0f, 21));
    }

    public final void a(int i3) {
        if (i3 == 0) {
            i3 = R.drawable.msg_add;
        }
        if (this.s != i3) {
            this.s = i3;
            org.telegram.messenger.g0.R3(this.d, i3);
        }
    }

    public final void b(RectF rectF) {
        c1 c1Var = this.f;
        rectF.set(org.telegram.messenger.g0.L(8.0f) + c1Var.getLeft(), c1Var.getTop(), org.telegram.messenger.g0.L(8.0f) + c1Var.getRight(), c1Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i3 = this.r + layoutParams.leftMargin;
            this.r = i3;
            view.layout(i3, (getMeasuredHeight() - layoutParams.height) / 2, this.r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.r = layoutParams.width + layoutParams.rightMargin + this.r;
        }
    }

    public final void d(int i3, boolean z10) {
        int i10 = this.a;
        this.a = i3;
        List list = x;
        fh0 fh0Var = this.b;
        if (i10 == i3) {
            ch0 animatedDrawable = fh0Var.getAnimatedDrawable();
            a1 a1Var = (a1) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a1 a1Var2 = (a1) it.next();
                if (this.a == a1Var2.b) {
                    a1Var = a1Var2;
                    break;
                }
            }
            animatedDrawable.M(a1Var.d);
            animatedDrawable.P(a1Var.d);
            if (z10) {
                this.h.c(i3);
                return;
            }
            return;
        }
        a1 a1Var3 = (a1) list.get(0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            a1 a1Var4 = (a1) it2.next();
            if (i10 == a1Var4.a && this.a == a1Var4.b) {
                a1Var3 = a1Var4;
                break;
            }
        }
        ch0 animatedDrawable2 = fh0Var.getAnimatedDrawable();
        animatedDrawable2.M(a1Var3.c);
        animatedDrawable2.P(a1Var3.d);
        animatedDrawable2.start();
        if (z10) {
            this.h.c(i3);
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        String str;
        if (i3 != hs.C5 || (str = this.w) == null) {
            return;
        }
        setTypeface(str);
        this.w = null;
    }

    public final void e(int i3, boolean z10) {
        if (this.n == i3) {
            return;
        }
        this.n = i3;
        int i10 = i3 != 1 ? i3 != 2 ? i3 != 3 ? R.drawable.msg_photo_text_framed : R.drawable.msg_photo_text_regular : R.drawable.msg_photo_text_framed3 : R.drawable.msg_photo_text_framed2;
        ImageView imageView = this.c;
        if (z10) {
            org.telegram.messenger.g0.R3(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
    }

    public View getColorClickableView() {
        return this.e;
    }

    public hg getEmojiButton() {
        return null;
    }

    public c1 getTypefaceCell() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.e().c(this, hs.C5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.e().n(this, hs.C5);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        this.r = getPaddingLeft();
        c(this.e);
        c(this.b);
        c(this.c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        c1 c1Var = this.f;
        c1Var.layout(measuredWidth - c1Var.getMeasuredWidth(), (getMeasuredHeight() - c1Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (c1Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            c1 c1Var = this.f;
            if (childAt == c1Var) {
                c1Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
            } else {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                paddingLeft -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setAlignment(int i3) {
        d(i3, false);
    }

    public void setDelegate(b1 b1Var) {
        this.h = b1Var;
    }

    public void setOutlineType(int i3) {
        e(i3, false);
    }

    public void setTypeface(String str) {
        this.w = str;
        c1 c1Var = this.f;
        if (c1Var == null) {
            return;
        }
        for (tg.b0 b0Var : tg.b0.c()) {
            if (b0Var.a.equals(str)) {
                c1Var.setTypeface(b0Var.d());
                String str2 = b0Var.c;
                if (str2 == null) {
                    str2 = bd.N0(b0Var.b);
                }
                c1Var.setText(str2);
                return;
            }
        }
    }

    public void setTypefaceListView(i1 i1Var) {
    }
}
