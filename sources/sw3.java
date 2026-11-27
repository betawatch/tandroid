// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class sw3 extends FrameLayout implements snb {
    public final vnb a;
    public final FrameLayout b;
    public final ImageView c;
    public final dw9 d;
    public final m7 e;
    public final int f;
    public rw3 h;
    public boolean n;
    public final ImageView r;
    public boolean s;
    public boolean w;
    public icc x;

    public sw3(Context context, vnb vnbVar) {
        super(context);
        this.f = -1;
        this.a = vnbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        int L = hl.L(18.0f);
        int i = aob.Af;
        Drawable b0 = aob.b0(L, aob.v0(i, vnbVar));
        uob M = yob.M(i);
        frameLayout.setBackground(b0);
        yob.j(frameLayout, b0, M, null, vnbVar);
        final byte b = 1;
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new yi((byte) 3));
        addView(frameLayout, tre.d(-1, 36.0f, jn7.D1, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, tre.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        dw9 dw9Var = new dw9();
        this.d = dw9Var;
        final byte b2 = 0;
        dw9Var.c(0, false, false);
        int i2 = aob.Bf;
        dw9Var.a(aob.v0(i2, vnbVar));
        imageView.setImageDrawable(dw9Var);
        frameLayout.addView(imageView, tre.e(36, 36, 51));
        m7 m7Var = new m7((byte) 2, context, this);
        this.e = m7Var;
        m7Var.setTextSize(1, 16.0f);
        yob.D(m7Var, i2, vnbVar);
        yob.X(m7Var, aob.G6, vnbVar);
        m7Var.setBackgroundDrawable(null);
        m7Var.setPadding(0, 0, 0, 0);
        m7Var.setMaxLines(1);
        m7Var.setLines(1);
        m7Var.setSingleLine(true);
        m7Var.setImeOptions(268435459);
        m7Var.setHint(ob6.M0(2131745564, null));
        int i3 = aob.Di;
        yob.l(m7Var, 30, i3, vnbVar);
        yob.l(m7Var, 36, i3, vnbVar);
        m7Var.setCursorSize(hl.L(20.0f));
        m7Var.setCursorWidth(1.5f);
        m7Var.setTranslationY(hl.L(-2.0f));
        frameLayout2.addView(m7Var, tre.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        m7Var.addTextChangedListener(new c7(this, (byte) 20));
        ImageView imageView2 = new ImageView(context);
        this.r = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new e7(vnbVar));
        int i4 = aob.i6;
        hf0 f0 = aob.f0(aob.v0(i4, vnbVar), 1, hl.L(15.0f));
        uob M2 = yob.M(i4);
        imageView2.setBackground(f0);
        yob.j(imageView2, f0, null, M2, vnbVar);
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: pw3
            public final /* synthetic */ sw3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                sw3 sw3Var = this.b;
                switch (b3) {
                    case 0:
                        sw3Var.b();
                        break;
                    default:
                        byte b4 = sw3Var.d.k;
                        if (b4 != 1) {
                            if (b4 == 0) {
                                sw3Var.e.requestFocus();
                                break;
                            }
                        } else {
                            sw3Var.b();
                            rw3 rw3Var = sw3Var.h;
                            if (rw3Var != null) {
                                rw3Var.H1();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, tre.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: pw3
            public final /* synthetic */ sw3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                sw3 sw3Var = this.b;
                switch (b3) {
                    case 0:
                        sw3Var.b();
                        break;
                    default:
                        byte b4 = sw3Var.d.k;
                        if (b4 != 1) {
                            if (b4 == 0) {
                                sw3Var.e.requestFocus();
                                break;
                            }
                        } else {
                            sw3Var.b();
                            rw3 rw3Var = sw3Var.h;
                            if (rw3Var != null) {
                                rw3Var.H1();
                                break;
                            }
                        }
                        break;
                }
            }
        });
    }

    public final void a(int i, boolean z) {
        if (this.f != i || this.h == null) {
            rw3 rw3Var = this.h;
            FrameLayout frameLayout = this.b;
            if (rw3Var != null) {
                frameLayout.removeView(rw3Var);
            }
            final byte b = 0;
            final byte b2 = 1;
            rw3 rw3Var2 = new rw3(this, getContext(), i == 1 ? 3 : 0, this.a, z);
            this.h = rw3Var2;
            m7 m7Var = this.e;
            rw3Var2.setDontOccupyWidth(hl.L(16.0f) + ((int) m7Var.getPaint().measureText(((Object) m7Var.getHint()) + "")));
            this.h.setOnScrollIntoOccupiedWidth(new pcc(this) { // from class: qw3
                public final /* synthetic */ sw3 b;

                {
                    this.b = this;
                }

                @Override // pcc
                public final void a(Object obj) {
                    byte b3 = b;
                    sw3 sw3Var = this.b;
                    switch (b3) {
                        case 0:
                            m7 m7Var2 = sw3Var.e;
                            m7Var2.animate().cancel();
                            m7Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            sw3Var.d(false);
                            break;
                        default:
                            q2b q2bVar = (q2b) obj;
                            rw3 rw3Var3 = sw3Var.h;
                            if (rw3Var3 != null) {
                                q2b selectedCategory = rw3Var3.getSelectedCategory();
                                rw3 rw3Var4 = sw3Var.h;
                                if (selectedCategory != q2bVar) {
                                    rw3Var4.J1(q2bVar);
                                    String str = q2bVar.a;
                                    int categoryIndex = sw3Var.h.getCategoryIndex();
                                    icc iccVar = sw3Var.x;
                                    if (iccVar != null) {
                                        iccVar.a(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    rw3Var4.J1(null);
                                    icc iccVar2 = sw3Var.x;
                                    if (iccVar2 != null) {
                                        iccVar2.a(null, -1);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            this.h.setOnCategoryClick(new pcc(this) { // from class: qw3
                public final /* synthetic */ sw3 b;

                {
                    this.b = this;
                }

                @Override // pcc
                public final void a(Object obj) {
                    byte b3 = b2;
                    sw3 sw3Var = this.b;
                    switch (b3) {
                        case 0:
                            m7 m7Var2 = sw3Var.e;
                            m7Var2.animate().cancel();
                            m7Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            sw3Var.d(false);
                            break;
                        default:
                            q2b q2bVar = (q2b) obj;
                            rw3 rw3Var3 = sw3Var.h;
                            if (rw3Var3 != null) {
                                q2b selectedCategory = rw3Var3.getSelectedCategory();
                                rw3 rw3Var4 = sw3Var.h;
                                if (selectedCategory != q2bVar) {
                                    rw3Var4.J1(q2bVar);
                                    String str = q2bVar.a;
                                    int categoryIndex = sw3Var.h.getCategoryIndex();
                                    icc iccVar = sw3Var.x;
                                    if (iccVar != null) {
                                        iccVar.a(str, Integer.valueOf(categoryIndex));
                                        break;
                                    }
                                } else {
                                    rw3Var4.J1(null);
                                    icc iccVar2 = sw3Var.x;
                                    if (iccVar2 != null) {
                                        iccVar2.a(null, -1);
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            frameLayout.addView(this.h, Math.max(0, frameLayout.getChildCount() - 1), tre.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void b() {
        this.e.setText("");
        icc iccVar = this.x;
        if (iccVar != null) {
            iccVar.a(null, -1);
        }
        rw3 rw3Var = this.h;
        if (rw3Var != null) {
            rw3Var.J1(null);
        }
    }

    public final void c(boolean z) {
        this.w = z;
        if (z) {
            this.d.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z) {
        rw3 rw3Var;
        rw3 rw3Var2;
        boolean z2 = this.w;
        m7 m7Var = this.e;
        if (!z2 || ((m7Var.length() == 0 && ((rw3Var2 = this.h) == null || rw3Var2.getSelectedCategory() == null)) || z)) {
            this.d.b((m7Var.length() > 0 || ((rw3Var = this.h) != null && rw3Var.w3 > 0.5f && ((rw3Var != null && rw3Var.r3) || rw3Var.getSelectedCategory() != null))) ? 1 : 0);
            this.w = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), TLObject.FLAG_30));
    }

    @Override // snb
    public final void updateColors() {
        try {
            dw9 dw9Var = this.d;
            vnb vnbVar = this.a;
            if (dw9Var != null) {
                dw9Var.a(aob.v0(aob.Bf, vnbVar));
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.invalidate();
            }
            m7 m7Var = this.e;
            if (m7Var != null) {
                int i = aob.Di;
                m7Var.setCursorColor(aob.v0(i, vnbVar));
                m7Var.setHandlesColor(aob.v0(i, vnbVar));
            }
            ImageView imageView2 = this.r;
            if (imageView2 != null) {
                imageView2.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
