package yf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import g7.e6;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.qg;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final List w = Arrays.asList(new l1(0, 1, 20, 0), new l1(0, 2, 20, 40), new l1(1, 0, 0, 20), new l1(1, 2, 60, 40), new l1(2, 0, 40, 20), new l1(2, 1, 40, 60));
    public int a;
    public final pi0 b;
    public final ImageView c;
    public final ImageView d;
    public final View e;
    public final n1 f;
    public m1 h;
    public int n;
    public int r;
    public int s;
    public String v;

    public o1(Context context) {
        super(context);
        this.a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.e = view;
        final int i9 = 0;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: yf.k1
            public final /* synthetic */ o1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i9) {
                    case 0:
                        this.b.h.a();
                        break;
                    case 1:
                        o1 o1Var = this.b;
                        o1Var.d((o1Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.e();
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
        addView(view, e6.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        pi0 pi0Var = new pi0(context);
        this.b = pi0Var;
        pi0Var.f(R.raw.photo_text_allign, 24, 24, null);
        mi0 animatedDrawable = pi0Var.getAnimatedDrawable();
        animatedDrawable.h = true;
        animatedDrawable.N(20);
        animatedDrawable.K(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        pi0Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        final int i10 = 1;
        pi0Var.setOnClickListener(new View.OnClickListener(this) { // from class: yf.k1
            public final /* synthetic */ o1 b;

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
                        o1 o1Var = this.b;
                        o1Var.d((o1Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.e();
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
        pi0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView(pi0Var, e6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_text_outlined);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        final int i11 = 2;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: yf.k1
            public final /* synthetic */ o1 b;

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
                        o1 o1Var = this.b;
                        o1Var.d((o1Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.e();
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
        addView(imageView, e6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setImageResource(R.drawable.msg_add);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(f6.f0(1090519039, 1, -1));
        final int i12 = 3;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: yf.k1
            public final /* synthetic */ o1 b;

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
                        o1 o1Var = this.b;
                        o1Var.d((o1Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.e();
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
        imageView2.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView(imageView2, e6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        n1 n1Var = new n1(context);
        this.f = n1Var;
        n1Var.setCurrent(true);
        final int i13 = 4;
        n1Var.setOnClickListener(new View.OnClickListener(this) { // from class: yf.k1
            public final /* synthetic */ o1 b;

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
                        o1 o1Var = this.b;
                        o1Var.d((o1Var.a + 1) % 3, true);
                        break;
                    case 2:
                        this.b.h.e();
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
        addView(n1Var, e6.o(-2, -2, 0.0f, 21));
    }

    public final void a(int i9) {
        if (i9 == 0) {
            i9 = R.drawable.msg_add;
        }
        if (this.s != i9) {
            this.s = i9;
            AndroidUtilities.updateImageViewImageAnimated(this.d, i9);
        }
    }

    public final void b(RectF rectF) {
        n1 n1Var = this.f;
        rectF.set(AndroidUtilities.dp(8.0f) + n1Var.getLeft(), n1Var.getTop(), AndroidUtilities.dp(8.0f) + n1Var.getRight(), n1Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i9 = this.r + layoutParams.leftMargin;
            this.r = i9;
            view.layout(i9, (getMeasuredHeight() - layoutParams.height) / 2, this.r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.r = layoutParams.width + layoutParams.rightMargin + this.r;
        }
    }

    public final void d(int i9, boolean z10) {
        int i10 = this.a;
        this.a = i9;
        List list = w;
        pi0 pi0Var = this.b;
        if (i10 == i9) {
            mi0 animatedDrawable = pi0Var.getAnimatedDrawable();
            l1 l1Var = (l1) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l1 l1Var2 = (l1) it.next();
                if (this.a == l1Var2.b) {
                    l1Var = l1Var2;
                    break;
                }
            }
            animatedDrawable.K(l1Var.d);
            animatedDrawable.N(l1Var.d);
            if (z10) {
                this.h.f(i9);
                return;
            }
            return;
        }
        l1 l1Var3 = (l1) list.get(0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            l1 l1Var4 = (l1) it2.next();
            if (i10 == l1Var4.a && this.a == l1Var4.b) {
                l1Var3 = l1Var4;
                break;
            }
        }
        mi0 animatedDrawable2 = pi0Var.getAnimatedDrawable();
        animatedDrawable2.K(l1Var3.c);
        animatedDrawable2.N(l1Var3.d);
        animatedDrawable2.start();
        if (z10) {
            this.h.f(i9);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        String str;
        if (i9 != NotificationCenter.customTypefacesLoaded || (str = this.v) == null) {
            return;
        }
        setTypeface(str);
        this.v = null;
    }

    public final void e(int i9, boolean z10) {
        if (this.n == i9) {
            return;
        }
        this.n = i9;
        int i10 = i9 != 1 ? i9 != 2 ? i9 != 3 ? R.drawable.msg_photo_text_framed : R.drawable.msg_photo_text_regular : R.drawable.msg_photo_text_framed3 : R.drawable.msg_photo_text_framed2;
        ImageView imageView = this.c;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
    }

    public View getColorClickableView() {
        return this.e;
    }

    public qg getEmojiButton() {
        return null;
    }

    public n1 getTypefaceCell() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        this.r = getPaddingLeft();
        c(this.e);
        c(this.b);
        c(this.c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        n1 n1Var = this.f;
        n1Var.layout(measuredWidth - n1Var.getMeasuredWidth(), (getMeasuredHeight() - n1Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (n1Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            n1 n1Var = this.f;
            if (childAt == n1Var) {
                n1Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
            } else {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                paddingLeft -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setAlignment(int i9) {
        d(i9, false);
    }

    public void setDelegate(m1 m1Var) {
        this.h = m1Var;
    }

    public void setOutlineType(int i9) {
        e(i9, false);
    }

    public void setTypeface(String str) {
        this.v = str;
        n1 n1Var = this.f;
        if (n1Var == null) {
            return;
        }
        for (xf.i0 i0Var : xf.i0.c()) {
            if (i0Var.a.equals(str)) {
                n1Var.setTypeface(i0Var.d());
                String str2 = i0Var.c;
                if (str2 == null) {
                    str2 = LocaleController.getString(i0Var.b);
                }
                n1Var.setText(str2);
                return;
            }
        }
    }

    public void setTypefaceListView(t1 t1Var) {
    }
}
