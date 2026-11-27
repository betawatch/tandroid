// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class v83 extends la {
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v83(Object obj, byte b) {
        this.d = b;
        this.e = obj;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        switch (this.d) {
            case 0:
                s83 s83Var = (s83) ((x83) this.e).k3.get(f89Var.b());
                int i = s83Var.a;
                if (i != 5) {
                    if (i != 2 || s83Var.h == -1) {
                        break;
                    }
                }
                break;
            case 1:
                int i2 = f89Var.f;
                if (i2 != 4 && i2 != 3 && i2 != 5) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // j79
    public final int b() {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                return ((x83) obj).k3.size();
            case 1:
                return ((q86) obj).s.size();
            default:
                return ((i49) obj).d.size();
        }
    }

    @Override // j79
    public final int d(int i) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                return ((s83) ((x83) obj).k3.get(i)).a;
            case 1:
                ArrayList arrayList = ((q86) obj).s;
                if (i < 0 || i >= arrayList.size()) {
                    return 2;
                }
                return ((k86) arrayList.get(i)).a;
            default:
                return ((y39) ((i49) obj).d.get(i)).a;
        }
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        float f;
        byte b = this.d;
        Boolean bool = null;
        Object obj = this.e;
        switch (b) {
            case 0:
                x83 x83Var = (x83) obj;
                ArrayList arrayList = x83Var.k3;
                int b2 = f89Var.b();
                View view = f89Var.a;
                s83 s83Var = (s83) arrayList.get(b2);
                int i2 = f89Var.f;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 != 5) {
                                        if (i2 == 6) {
                                            ((y83) view).setTop(true);
                                            break;
                                        }
                                    } else {
                                        ((skb) view).k(s83Var.f.toString(), false);
                                        break;
                                    }
                                } else {
                                    ((mf5) view).setText(s83Var.f);
                                    break;
                                }
                            } else {
                                ((ilb) view).setText(s83Var.f);
                                break;
                            }
                        } else {
                            q83 q83Var = (q83) view;
                            int i3 = s83Var.d;
                            int i4 = s83Var.e;
                            int i5 = s83Var.c;
                            CharSequence charSequence = s83Var.f;
                            String str = s83Var.g;
                            int i6 = i + 1;
                            boolean z = i6 < b() && ((s83) arrayList.get(i6)).a == i2;
                            ImageView imageView = q83Var.a;
                            if (i5 == 0) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                                boolean o = aob.I.o();
                                n57 n57Var = new n57((byte) 1);
                                n57Var.b(i3, i4);
                                n57Var.b = o;
                                imageView.setBackground(n57Var);
                                imageView.setImageResource(i5);
                            }
                            q83Var.b.setText(charSequence);
                            q83Var.d.setText(str);
                            q83Var.e = z;
                            q83Var.setWillNotDraw(!z);
                            int i7 = s83Var.h;
                            if (i7 >= 0) {
                                w83[] w83VarArr = x83Var.o3;
                                if (i7 >= w83VarArr.length || w83VarArr[i7].c > 0) {
                                    bool = Boolean.valueOf(x83Var.q3[i7]);
                                }
                            }
                            ImageView imageView2 = q83Var.c;
                            if (bool != null) {
                                imageView2.setVisibility(0);
                                imageView2.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(360L).setInterpolator(k43.h).start();
                                break;
                            } else {
                                imageView2.setVisibility(8);
                                break;
                            }
                        }
                    } else {
                        ((z83) view).a.setText(s83Var.f);
                        break;
                    }
                } else {
                    z51 z51Var = (z51) view;
                    if (x83Var.o3 != null) {
                        z51Var.e(x83Var.r3, x83Var.f3, x83Var.p3);
                    }
                    x83Var.f3 = false;
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = ((q86) obj).s;
                if (i >= 0 && i < arrayList2.size()) {
                    k86 k86Var = (k86) arrayList2.get(i);
                    int i8 = f89Var.f;
                    View view2 = f89Var.a;
                    if (i8 != 0) {
                        if (i8 != 1) {
                            if (i8 != 2) {
                                if (i8 != 3 && i8 != 4) {
                                    if (i8 == 5) {
                                        skb skbVar = (skb) view2;
                                        if (k86Var.f) {
                                            skbVar.l(k86Var.c, uc7.e1().getBoolean("view_animations", true), false);
                                            break;
                                        }
                                    }
                                } else {
                                    int i9 = i + 1;
                                    boolean z2 = i9 < arrayList2.size() && ((k86) arrayList2.get(i9)).a != 2;
                                    p86 p86Var = (p86) view2;
                                    Switch r2 = p86Var.f;
                                    ImageView imageView3 = p86Var.e;
                                    in inVar = p86Var.d;
                                    ImageView imageView4 = p86Var.a;
                                    xb xbVar = p86Var.c;
                                    int i10 = k86Var.a;
                                    String str2 = k86Var.c;
                                    int i11 = k86Var.e;
                                    og2 og2Var = p86Var.h;
                                    if (i10 == 3) {
                                        og2Var.setVisibility(8);
                                        imageView4.setVisibility(0);
                                        imageView4.setImageResource(k86Var.d);
                                        xbVar.setText(str2);
                                        boolean z3 = Integer.bitCount(i11) > 1;
                                        p86Var.w = z3;
                                        if (z3) {
                                            p86Var.c(k86Var, false);
                                            inVar.setVisibility(0);
                                            imageView3.setVisibility(0);
                                        } else {
                                            inVar.setVisibility(8);
                                            imageView3.setVisibility(8);
                                        }
                                        xbVar.setTranslationX(0.0f);
                                        r2.setVisibility(0);
                                        r2.c(i86.e(i11), false);
                                        p86Var.r = Integer.bitCount(i11) > 1;
                                    } else {
                                        og2Var.setVisibility(0);
                                        og2Var.a(i86.e(i11), false);
                                        imageView4.setVisibility(8);
                                        r2.setVisibility(8);
                                        inVar.setVisibility(8);
                                        imageView3.setVisibility(8);
                                        xbVar.setText(str2);
                                        xbVar.setTranslationX(hl.L(41.0f) * (ob6.a0 ? -2.2f : 1.0f));
                                        p86Var.w = false;
                                        p86Var.r = false;
                                    }
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p86Var.b.getLayoutParams();
                                    if (k86Var.a == 3) {
                                        f = (ob6.a0 ? 64 : 75) + 4;
                                    } else {
                                        f = 8.0f;
                                    }
                                    marginLayoutParams.rightMargin = hl.L(f);
                                    p86Var.n = z2;
                                    p86Var.setWillNotDraw((z2 || p86Var.r) ? false : true);
                                    p86Var.b(i86.f(), false);
                                    break;
                                }
                            } else {
                                ilb ilbVar = (ilb) view2;
                                String str3 = k86Var.c;
                                if (TextUtils.isEmpty(str3)) {
                                    ilbVar.setFixedSize(12);
                                } else {
                                    ilbVar.setFixedSize(0);
                                }
                                ilbVar.setText(str3);
                                ilbVar.setContentDescription(str3);
                                ilbVar.setBackground(null);
                                break;
                            }
                        } else {
                            ((o86) view2).a();
                            break;
                        }
                    } else {
                        ((mf5) view2).setText(k86Var.c);
                        break;
                    }
                }
                break;
            default:
                int i12 = f89Var.f;
                if (i12 == 0 || i12 == 3) {
                    g49 g49Var = (g49) f89Var.a;
                    g49Var.setScaleX(1.0f);
                    g49Var.setScaleY(1.0f);
                    g49Var.d(i, ((y39) ((i49) obj).d.get(i)).c);
                    break;
                }
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        byte b = this.d;
        Object obj = this.e;
        View view3 = null;
        final byte b2 = 0;
        final byte b3 = 1;
        switch (b) {
            case 0:
                x83 x83Var = (x83) obj;
                vnb vnbVar = x83Var.o2;
                if (i == 0) {
                    Context context = x83Var.getContext();
                    int[] iArr = a93.s;
                    u83 u83Var = new u83(this, context, iArr.length, iArr, a93.w);
                    x83Var.v3 = u83Var;
                    u83Var.setInterceptTouch(false);
                    View view4 = x83Var.v3;
                    view4.setTag(-33024);
                    view = view4;
                } else if (i == 1) {
                    Context context2 = x83Var.getContext();
                    z83 z83Var = new z83(context2);
                    TextView textView = new TextView(context2);
                    z83Var.a = textView;
                    textView.setGravity(17);
                    textView.setTextSize(1, 13.0f);
                    yob.X(textView, aob.y6, null);
                    z83Var.addView(textView, tre.d(-1, -2.0f, jn7.D1, 24.0f, 0.0f, 24.0f, 14.0f));
                    z83Var.setTag(-33024);
                    view = z83Var;
                } else if (i == 3) {
                    view = new ilb(x83Var.getContext());
                } else if (i == 4) {
                    View mf5Var = new mf5(x83Var.getContext());
                    yob.h(aob.d6, vnbVar, mf5Var);
                    view = mf5Var;
                } else if (i != 5) {
                    byte b4 = 6;
                    if (i == 6) {
                        y83 y83Var = new y83(x83Var.getContext());
                        y83Var.a = new Path();
                        Paint paint = new Paint(1);
                        y83Var.b = paint;
                        y83Var.c = true;
                        paint.setShadowLayer(hl.L(1.0f), 0.0f, hl.L(-0.66f), 251658240);
                        paint.setColor(aob.w0(null, aob.d6, false));
                        view = y83Var;
                    } else if (i != 7) {
                        view = new q83(x83Var.w3, x83Var.getContext());
                    } else {
                        View t62Var = new t62(x83Var.getContext(), b4);
                        int i2 = aob.d6;
                        int i3 = x83.x3;
                        yob.h(i2, x83Var.o2, t62Var);
                        view = t62Var;
                    }
                } else {
                    skb skbVar = new skb(x83Var.getContext());
                    yob.W(skbVar.getTextView(), aob.p7, vnbVar);
                    yob.h(aob.d6, vnbVar, skbVar);
                    view = skbVar;
                }
                return new n69(view);
            case 1:
                q86 q86Var = (q86) obj;
                Context context3 = viewGroup.getContext();
                if (i == 0) {
                    view3 = new mf5(context3);
                } else if (i == 1) {
                    view3 = new o86(q86Var, context3);
                } else if (i == 2) {
                    view3 = new j86(context3);
                } else if (i == 3 || i == 4) {
                    view3 = new p86(q86Var, context3);
                } else if (i == 5) {
                    view3 = new skb(23, null, context3, false, true);
                }
                return new n69(view3);
            default:
                i49 i49Var = (i49) obj;
                if (i == 1) {
                    i49Var.S = new FrameLayout(i49Var.getContext());
                    cl8 cl8Var = new cl8(0, null, i49Var.getContext());
                    i49Var.v0 = cl8Var;
                    int w0 = aob.w0(null, aob.F8, false);
                    int i4 = aob.h5;
                    cl8Var.setColor(vm2.f(0.7f, w0, aob.w0(null, i4, false)));
                    yob.s(i49Var.v0, i4, null, PorterDuff.Mode.MULTIPLY);
                    i49Var.v0.setScaleX(0.0f);
                    i49Var.v0.setScaleY(0.0f);
                    i49Var.v0.setPadding(hl.L(1.0f), hl.L(1.0f), hl.L(1.0f), hl.L(1.0f));
                    i49Var.S.addView(i49Var.v0, tre.e(26, 26, 17));
                    i49Var.v0.setOnClickListener(new View.OnClickListener(this) { // from class: x39
                        public final /* synthetic */ v83 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view5) {
                            byte b5 = b2;
                            v83 v83Var = this.b;
                            switch (b5) {
                                case 0:
                                    view5.getLocationOnScreen(new int[2]);
                                    i49 i49Var2 = (i49) v83Var.e;
                                    view5.getMeasuredWidth();
                                    view5.getMeasuredHeight();
                                    new xk8(i49Var2.u0, 4, true).show();
                                    break;
                                default:
                                    ((i49) v83Var.e).o();
                                    break;
                            }
                        }
                    });
                    view2 = i49Var.S;
                } else if (i != 2) {
                    view2 = new g49(i49Var, i49Var.getContext());
                } else {
                    i49Var.T = new tt(i49Var, i49Var.getContext());
                    i53 i53Var = new i53(i49Var, i49Var.getContext());
                    i49Var.w0 = i53Var;
                    i53Var.setImageResource(R.drawable.msg_reactions_expand);
                    i49Var.w0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    byte b5 = i49Var.N0;
                    if (b5 == 1 || b5 == 2 || b5 == 4) {
                        i49Var.w0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                    } else {
                        yob.s(i49Var.w0, aob.h5, null, PorterDuff.Mode.MULTIPLY);
                    }
                    i53 i53Var2 = i49Var.w0;
                    int L = hl.L(28.0f);
                    int i5 = aob.i6;
                    yob.R(i53Var2, aob.h0(L, 0, vm2.o(aob.w0(null, i5, false), 40)), null, yob.g(i5, 40), null);
                    i49Var.w0.setPadding(hl.L(2.0f), hl.L(2.0f), hl.L(2.0f), hl.L(2.0f));
                    i49Var.w0.setContentDescription(ob6.M0(2131754879, null));
                    i49Var.T.addView(i49Var.w0, tre.e(30, 30, 17));
                    i49Var.w0.setOnClickListener(new View.OnClickListener(this) { // from class: x39
                        public final /* synthetic */ v83 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view5) {
                            byte b52 = b3;
                            v83 v83Var = this.b;
                            switch (b52) {
                                case 0:
                                    view5.getLocationOnScreen(new int[2]);
                                    i49 i49Var2 = (i49) v83Var.e;
                                    view5.getMeasuredWidth();
                                    view5.getMeasuredHeight();
                                    new xk8(i49Var2.u0, 4, true).show();
                                    break;
                                default:
                                    ((i49) v83Var.e).o();
                                    break;
                            }
                        }
                    });
                    view2 = i49Var.T;
                }
                int topOffset = ((i49Var.getLayoutParams().height - ((int) i49Var.getTopOffset())) - i49Var.getPaddingTop()) - i49Var.getPaddingBottom();
                view2.setLayoutParams(new r79(topOffset - hl.L(12.0f), topOffset));
                return new n69(view2);
        }
    }

    @Override // j79
    public final void y(f89 f89Var) {
        int b;
        switch (this.d) {
            case 2:
                ArrayList arrayList = ((i49) this.e).d;
                int i = f89Var.f;
                if ((i == 0 || i == 3) && (b = f89Var.b()) >= 0 && b < arrayList.size()) {
                    ((g49) f89Var.a).f(((y39) arrayList.get(b)).c, false);
                    break;
                }
                break;
        }
    }
}
