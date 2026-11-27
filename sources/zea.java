// default package

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class zea extends FrameLayout implements snb, jq3 {
    public final int E;
    public r47 F;
    public boolean G;
    public boolean H;
    public final byte I;
    public final SpannableStringBuilder J;
    public CharSequence K;
    public final b29 L;
    public final vnb M;
    public tk4 N;
    public long O;
    public boolean P;
    public float Q;
    public boolean R;
    public float S;
    public final ImageView a;
    public final mb0 b;
    public final TextView c;
    public final TextView d;
    public final gm e;
    public final e29 f;
    public final n46 h;
    public final og2 n;
    public final TextView r;
    public final TextView s;
    public boolean w;
    public boolean x;
    public final int y;

    /* JADX WARN: Multi-variable type inference failed */
    public zea(int i, vnb vnbVar, Context context) {
        super(context);
        float f;
        this.w = true;
        int i2 = yac.t0;
        this.y = i2;
        this.S = 1.0f;
        this.M = vnbVar;
        this.I = i;
        this.E = lq3.q(i2).k();
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        boolean z = ob6.a0;
        if (i == 1) {
            addView(imageView, tre.d(42, 42.0f, (z ? 5 : 3) | 48, z ? 0.0f : 15.0f, 12.0f, z ? 15.0f : 0.0f, 0.0f));
        } else {
            addView(imageView, tre.d(40, 40.0f, (z ? 5 : 3) | 48, z ? 0.0f : 12.0f, 8.0f, z ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        qd4.w(textView, aob.sj, vnbVar, 1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setImportantForAccessibility(2);
        boolean z2 = ob6.a0;
        if (i == 1) {
            addView(textView, tre.d(32, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 20.0f, 28.0f, z2 ? 20.0f : 0.0f, 0.0f));
        } else {
            addView(textView, tre.d(32, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 16.0f, 22.0f, z2 ? 16.0f : 0.0f, 0.0f));
        }
        mb0 mb0Var = new mb0((byte) 9, context, this);
        this.b = mb0Var;
        mb0Var.setRoundRadius(hl.L(4.0f));
        boolean z3 = ob6.a0;
        if (i == 1) {
            addView(mb0Var, tre.d(42, 42.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 16.0f, 12.0f, z3 ? 16.0f : 0.0f, 0.0f));
        } else {
            addView(mb0Var, tre.d(40, 40.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : 12.0f, 8.0f, z3 ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        int i3 = aob.G6;
        qd4.w(textView2, i3, vnbVar, 1, 16.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((ob6.a0 ? 5 : 3) | 16);
        if (i == 1) {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            boolean z4 = ob6.a0;
            addView(textView2, tre.d(-1, -2.0f, (z4 ? 5 : 3) | 48, z4 ? 8.0f : 72.0f, 9.0f, z4 ? 72.0f : 8.0f, 0.0f));
            f = 14.0f;
        } else if (i == 2) {
            LinearLayout j = uh9.j(context, 0);
            boolean z5 = ob6.a0;
            addView(j, tre.d(-1, -2.0f, (z5 ? 5 : 3) | 48, z5 ? 16.0f : 72.0f, 5.0f, z5 ? 72.0f : 16.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.r = textView3;
            yob.X(textView3, aob.A6, vnbVar);
            textView3.setTextSize(1, 14.0f);
            f = 14.0f;
            if (ob6.a0) {
                j.addView(textView3, tre.l(0.0f, -2, -2));
                j.addView(textView2, tre.m(1.0f, -2, -2, 0, 4, 0));
            } else {
                j.addView(textView2, tre.l(1.0f, -2, -2));
                j.addView(textView3, tre.m(0.0f, -2, -2, 4, 0, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.s = textView4;
            yob.X(textView4, i3, vnbVar);
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            textView4.setGravity((ob6.a0 ? 5 : 3) | 16);
            textView4.setTextSize(1, 13.0f);
            boolean z6 = ob6.a0;
            addView(textView4, tre.d(-1, -2.0f, (z6 ? 5 : 3) | 48, z6 ? 8.0f : 72.0f, 30.0f, z6 ? 72.0f : 8.0f, 0.0f));
            textView4.setVisibility(8);
        } else {
            f = 14.0f;
            textView2.setMaxLines(1);
            boolean z7 = ob6.a0;
            addView(textView2, tre.d(-1, -2.0f, (z7 ? 5 : 3) | 48, z7 ? 8.0f : 72.0f, 5.0f, z7 ? 72.0f : 8.0f, 0.0f));
        }
        b29 b29Var = new b29(R.raw.download_arrow, hl.L(f), hl.L(f), true, null);
        this.L = b29Var;
        e29 e29Var = new e29(context);
        this.f = e29Var;
        e29Var.setAnimation(b29Var);
        e29Var.setVisibility(4);
        int i4 = aob.zi;
        yob.s(e29Var, i4, vnbVar, PorterDuff.Mode.SRC_IN);
        boolean z8 = ob6.a0;
        if (i == 1) {
            addView(e29Var, tre.d(14, 14.0f, (z8 ? 5 : 3) | 48, z8 ? 8.0f : 70.0f, 37.0f, z8 ? 72.0f : 8.0f, 0.0f));
        } else {
            addView(e29Var, tre.d(14, 14.0f, (z8 ? 5 : 3) | 48, z8 ? 8.0f : 70.0f, 33.0f, z8 ? 72.0f : 8.0f, 0.0f));
        }
        gm gmVar = new gm(context);
        this.e = gmVar;
        yob.X(gmVar, aob.A6, vnbVar);
        gmVar.setLines(1);
        gmVar.setMaxLines(1);
        gmVar.setSingleLine(true);
        gmVar.setEllipsize(truncateAt);
        gmVar.setGravity((ob6.a0 ? 5 : 3) | 16);
        jn7.i(gmVar);
        if (i == 1) {
            gmVar.setTextSize(1, 13.0f);
            boolean z9 = ob6.a0;
            addView(gmVar, tre.d(-1, -2.0f, (z9 ? 5 : 3) | 48, z9 ? 8.0f : 72.0f, 34.0f, z9 ? 72.0f : 8.0f, 0.0f));
        } else {
            gmVar.setTextSize(1, 13.0f);
            boolean z10 = ob6.a0;
            addView(gmVar, tre.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 8.0f : 72.0f, 30.0f, z10 ? 72.0f : 8.0f, 0.0f));
        }
        n46 n46Var = new n46(context);
        this.h = n46Var;
        n46Var.setProgressColor(aob.v0(i4, vnbVar));
        boolean z11 = ob6.a0;
        addView(n46Var, tre.d(-1, 2.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 72.0f, 54.0f, z11 ? 72.0f : 0.0f, 0.0f));
        og2 og2Var = new og2(21, vnbVar, context);
        this.n = og2Var;
        og2Var.setVisibility(4);
        og2Var.b(-1, aob.d6, aob.k7);
        og2Var.setDrawUnchecked(false);
        og2Var.setDrawBackgroundAsArc(2);
        boolean z12 = ob6.a0;
        if (i == 1) {
            addView(og2Var, tre.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 38.0f, 36.0f, z12 ? 38.0f : 0.0f, 0.0f));
        } else {
            addView(og2Var, tre.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 33.0f, 28.0f, z12 ? 33.0f : 0.0f, 0.0f));
        }
        if (i == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.J = spannableStringBuilder;
            spannableStringBuilder.setSpan(new np3(), 0, 1, 0);
        }
    }

    @Override // jq3
    public final void B(boolean z) {
        f(true);
        this.O = 0L;
        e();
    }

    @Override // jq3
    public final void N(String str) {
        this.h.a(true, 1.0f);
        f(true);
        this.O = 0L;
        e();
    }

    public final void a(Canvas canvas) {
        if (this.x) {
            canvas.drawLine(hl.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, aob.U0("paintDivider", this.M));
        }
    }

    public final void b(boolean z, boolean z2) {
        og2 og2Var = this.n;
        if (og2Var.getVisibility() != 0) {
            og2Var.setVisibility(0);
        }
        og2Var.a(z, z2);
    }

    public final void c(r47 r47Var, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        r47 r47Var2 = this.F;
        boolean z2 = (r47Var2 == null || r47Var == null || r47Var2.e1() == r47Var.e1()) ? false : true;
        this.x = z;
        this.F = r47Var;
        this.H = false;
        this.G = false;
        if (!z2) {
            this.O = 0L;
        }
        TLRPC.Document F0 = r47Var.F0();
        TextView textView = this.c;
        TextView textView2 = this.s;
        ImageView imageView = this.a;
        TextView textView3 = this.d;
        mb0 mb0Var = this.b;
        if (F0 != null) {
            if (r47Var.I3()) {
                str = null;
                for (int i = 0; i < F0.attributes.size(); i++) {
                    TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && (((str3 = documentAttribute.performer) != null && str3.length() != 0) || ((str4 = documentAttribute.title) != null && str4.length() != 0))) {
                        str = r47Var.w1(true) + " - " + r47Var.y1(true);
                    }
                }
            } else {
                str = null;
            }
            String B = (r47.K4(r47Var.k) || (r47Var.k.media instanceof TLRPC.TL_messageMediaPhoto) || r47.s3(F0, false)) ? null : xb4.B(F0);
            if (TextUtils.isEmpty(B) && (str2 = F0.mime_type) != null) {
                B = str2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) ? r47.s3(F0, false) ? ob6.M0(2131753964, null) : ob6.M0(2131753926, null) : F0.mime_type.startsWith("image") ? r47.s3(F0, false) ? ob6.M0(2131753964, null) : ob6.M0(2131753941, null) : F0.mime_type.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND) ? ob6.M0(2131753975, null) : ob6.M0(2131753968, null);
            }
            String str5 = str == null ? B : str;
            ArrayList arrayList = r47Var.a2;
            vnb vnbVar = this.M;
            CharSequence v1 = hl.v1(str5, arrayList, vnbVar);
            if (v1 != null) {
                textView.setText(v1);
            } else {
                textView.setText(str5);
            }
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            imageView.setImageResource(hl.l1(B, false));
            int lastIndexOf = B.lastIndexOf(46);
            textView3.setText(lastIndexOf != -1 ? B.substring(lastIndexOf + 1).toLowerCase() : "");
            TLRPC.PhotoSize w = xb4.w(F0.thumbs, jn7.q5, false, null, false);
            TLRPC.PhotoSize w2 = xb4.w(F0.thumbs, 40, false, null, false);
            if (w2 == w) {
                w = null;
            }
            if ((w2 instanceof TLRPC.TL_photoSizeEmpty) || w2 == null) {
                mb0Var.setVisibility(4);
                mb0Var.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            } else {
                mb0Var.getImageReceiver().G0 = w == null;
                mb0Var.getImageReceiver().H0 = w == null;
                mb0Var.setVisibility(0);
                if (r47Var.I1 != null) {
                    mb0Var.k(jn5.c(w, F0), "40_40", null, null, r47Var.I1, null, 1, r47Var);
                } else {
                    mb0Var.g(1, 0L, jn5.c(w, F0), jn5.c(w2, F0), r47Var, "40_40", "40_40_b", null);
                }
            }
            e();
            if (r47Var.r2() && !TextUtils.isEmpty(this.F.k.message)) {
                CharSequence v12 = hl.v1(this.F.k.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.F.a2, vnbVar);
                this.K = v12;
                if (textView2 != null) {
                    textView2.setVisibility(v12 == null ? 8 : 0);
                }
            } else if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else {
            textView.setText("");
            textView3.setText("");
            this.e.setText("");
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            mb0Var.setVisibility(4);
            mb0Var.setImageBitmap(null);
            this.K = null;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        setWillNotDraw(!this.x);
        this.h.a(false, 0.0f);
        f(z2);
    }

    public final void d(String str, String str2, String str3, String str4, int i, boolean z) {
        int i2;
        int i3;
        this.c.setText(str);
        this.e.setText(str2);
        TextView textView = this.d;
        if (str3 != null) {
            textView.setVisibility(0);
            textView.setText(str3.toLowerCase());
        } else {
            textView.setVisibility(4);
        }
        this.x = z;
        ImageView imageView = this.a;
        if (i == 0) {
            imageView.setImageResource(hl.l1(str, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        byte b = this.I;
        mb0 mb0Var = this.b;
        if (str4 == null) {
            if (i == 0) {
                textView.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
                if (b != 3) {
                    mb0Var.setImageBitmap(null);
                    mb0Var.setVisibility(4);
                }
                setWillNotDraw(!this.x);
            }
            zm2 M = aob.M(hl.L(42.0f), i);
            if (i == R.drawable.files_storage) {
                i2 = aob.na;
                i3 = aob.ia;
            } else if (i == R.drawable.files_gallery) {
                i2 = aob.la;
                i3 = aob.ia;
            } else if (i == R.drawable.files_music) {
                i2 = aob.ka;
                i3 = aob.ia;
            } else if (i == R.drawable.files_internal) {
                i2 = aob.ja;
                i3 = aob.ia;
            } else {
                i2 = aob.rj;
                i3 = aob.qj;
            }
            vnb vnbVar = this.M;
            aob.z1(M, aob.v0(i2, vnbVar), false);
            aob.z1(M, aob.v0(i3, vnbVar), true);
            mb0Var.setImageDrawable(M);
        } else if (b != 3) {
            mb0Var.o(str4, "42_42", null);
        }
        mb0Var.setVisibility(0);
        setWillNotDraw(!this.x);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.S == 1.0f || this.N == null) {
            super.dispatchDraw(canvas);
            a(canvas);
        } else {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.S) * 255.0f), 31);
            this.N.setViewType(3);
            this.N.updateColors();
            this.N.f();
            this.N.draw(canvas);
            canvas.restore();
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.S * 255.0f), 31);
            super.dispatchDraw(canvas);
            a(canvas);
            canvas.restore();
        }
        boolean z = this.P;
        float f = this.Q;
        if (z) {
            if (f != 1.0f) {
                this.Q = f + 0.10666667f;
                invalidate();
            }
        } else {
            if (f == 0.0f) {
                return;
            }
            if (f != 0.0f) {
                this.Q = f - 0.10666667f;
                invalidate();
            }
        }
        this.Q = Utilities.i(this.Q, 1.0f, 0.0f);
        int measuredWidth = (getMeasuredWidth() - hl.L(12.0f)) - aob.Y0.getIntrinsicWidth();
        int measuredHeight = (getMeasuredHeight() - aob.Y0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f2 = this.Q;
        canvas.scale(f2, f2, (aob.Y0.getIntrinsicWidth() / 2.0f) + measuredWidth, (aob.Y0.getIntrinsicHeight() / 2.0f) + measuredHeight);
        Drawable drawable = aob.Y0;
        drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, aob.Y0.getIntrinsicHeight() + measuredHeight);
        aob.Y0.draw(canvas);
        canvas.restore();
    }

    public final void e() {
        String y;
        r47 r47Var = this.F;
        if (r47Var == null || r47Var.F0() == null) {
            return;
        }
        r47 r47Var2 = this.F;
        long j = r47Var2.k.date * 1000;
        long j2 = this.O;
        if (j2 == 0) {
            y = hl.i0(r47Var2.F0().size, false, false);
        } else {
            Locale locale = Locale.ENGLISH;
            y = qd4.y(hl.i0(j2, false, false), " / ", hl.i0(this.F.F0().size, false, false));
        }
        byte b = this.I;
        gm gmVar = this.e;
        if (b == 2) {
            gmVar.setText(new SpannableStringBuilder().append((CharSequence) y).append(' ').append((CharSequence) this.J).append(' ').append(yg4.c(this.F, true, 2, gmVar.getPaint())));
            this.r.setText(ob6.e1(this.F.k.date));
            return;
        }
        gmVar.setText(y + ", " + ob6.a0("formatDateAtTime", null, 2131742414, ob6.D0().B0().format(new Date(j)), ob6.D0().o0().format(new Date(j))));
    }

    public final void f(boolean z) {
        if (z) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) k43.f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        r47 r47Var = this.F;
        int i = this.y;
        n46 n46Var = this.h;
        e29 e29Var = this.f;
        gm gmVar = this.e;
        if (r47Var == null || r47Var.k.media == null) {
            this.G = false;
            this.H = true;
            n46Var.setVisibility(4);
            n46Var.a(false, 0.0f);
            e29Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gmVar.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.leftMargin = hl.L(ob6.a0 ? 8.0f : 72.0f);
                layoutParams.rightMargin = hl.L(ob6.a0 ? 72.0f : 8.0f);
                gmVar.requestLayout();
            }
            lq3.q(i).v(this);
            return;
        }
        this.H = false;
        if (r47Var.y0 || r47Var.z0 || !this.w) {
            e29Var.setVisibility(4);
            n46Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) gmVar.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = hl.L(ob6.a0 ? 8.0f : 72.0f);
                layoutParams2.rightMargin = hl.L(ob6.a0 ? 72.0f : 8.0f);
                gmVar.requestLayout();
            }
            this.G = false;
            this.H = true;
            lq3.q(i).v(this);
            return;
        }
        String r = xb4.r(null, r47Var.F0());
        lq3.q(i).a(r, this.F, this);
        this.G = xb4.G(i).S(r);
        e29Var.setVisibility(0);
        int i2 = this.G ? 15 : 0;
        b29 b29Var = this.L;
        b29Var.K(i2);
        b29Var.h = true;
        if (z) {
            e29Var.d();
        } else {
            b29Var.H(this.G ? 15 : 0);
            e29Var.invalidate();
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) gmVar.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.leftMargin = hl.L(ob6.a0 ? 8.0f : 86.0f);
            layoutParams3.rightMargin = hl.L(ob6.a0 ? 86.0f : 8.0f);
            gmVar.requestLayout();
        }
        if (!this.G) {
            n46Var.setVisibility(4);
            return;
        }
        n46Var.setVisibility(0);
        Float s = in5.z().s(r);
        if (s == null) {
            s = Float.valueOf(0.0f);
        }
        n46Var.a(false, s.floatValue());
    }

    public de0 getImageView() {
        return this.b;
    }

    public r47 getMessage() {
        return this.F;
    }

    @Override // jq3
    public int getObserverTag() {
        return this.E;
    }

    @Override // jq3
    public final void i(long j, long j2) {
        n46 n46Var = this.h;
        if (n46Var.getVisibility() != 0) {
            f(true);
        }
        this.O = j;
        e();
        n46Var.a(true, Math.min(1.0f, j / j2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h.getVisibility() == 0) {
            f(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lq3.q(this.y).v(this);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        og2 og2Var = this.n;
        if (og2Var.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(og2Var.a.q);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.I != 1) {
            TextView textView = this.c;
            int lineCount = textView.getLineCount();
            TextView textView2 = this.s;
            if (lineCount > 1 || (textView2 != null && textView2.getVisibility() == 0)) {
                int measuredHeight = textView.getMeasuredHeight() - hl.L(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = uh9.w(3.0f, textView2.getMeasuredHeight(), measuredHeight);
                }
                gm gmVar = this.e;
                gmVar.layout(gmVar.getLeft(), gmVar.getTop() + measuredHeight, gmVar.getRight(), gmVar.getBottom() + measuredHeight);
                e29 e29Var = this.f;
                e29Var.layout(e29Var.getLeft(), e29Var.getTop() + measuredHeight, e29Var.getRight(), e29Var.getBottom() + measuredHeight);
                n46 n46Var = this.h;
                n46Var.layout(n46Var.getLeft(), (getMeasuredHeight() - n46Var.getMeasuredHeight()) - (this.x ? 1 : 0), n46Var.getRight(), getMeasuredHeight() - (this.x ? 1 : 0));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        TextView textView;
        byte b = this.I;
        if (b == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(64.0f) + (this.x ? 1 : 0), TLObject.FLAG_30));
            return;
        }
        if (b == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(56.0f), TLObject.FLAG_30));
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(56.0f), TLObject.FLAG_30));
        int measuredHeight = this.c.getMeasuredHeight() + hl.L(34.0f) + (this.x ? 1 : 0);
        if (this.K != null && (textView = this.s) != null && this.F.r2()) {
            this.R = true;
            textView.setText(hl.Q(this.K, (String) this.F.a2.get(0), textView.getMeasuredWidth(), textView.getPaint()));
            this.R = false;
            measuredHeight = uh9.w(3.0f, textView.getMeasuredHeight(), measuredHeight);
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.R) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawDownloadIcon(boolean z) {
        this.w = z;
    }

    public void setEnterAnimationAlpha(float f) {
        if (this.S != f) {
            this.S = f;
            invalidate();
        }
    }

    public void setGlobalGradientView(tk4 tk4Var) {
        this.N = tk4Var;
    }

    public void setPhoto(String str) {
        boolean endsWith = str.endsWith("mp4");
        mb0 mb0Var = this.b;
        if (endsWith) {
            mb0Var.o("vthumb://0:".concat(str), null, null);
            mb0Var.setVisibility(0);
        } else if (!str.endsWith(".jpg") && !str.endsWith(".jpeg") && !str.endsWith(".png") && !str.endsWith(".gif")) {
            mb0Var.setVisibility(8);
        } else {
            mb0Var.o("thumb://0:".concat(str), null, null);
            mb0Var.setVisibility(0);
        }
    }

    public void setPhotoEntry(no6 no6Var) {
        String str = no6Var.c;
        long j = no6Var.H;
        int i = no6Var.G;
        int i2 = no6Var.F;
        int i3 = no6Var.C;
        String str2 = no6Var.I;
        mb0 mb0Var = this.b;
        if (str != null) {
            mb0Var.o(str, null, aob.R4);
            str2 = no6Var.c;
        } else if (str2 == null) {
            mb0Var.setImageDrawable(aob.R4);
            str2 = "";
        } else if (no6Var.b) {
            mb0Var.q();
            mb0Var.o("vthumb://" + i3 + ":" + str2, null, aob.R4);
        } else {
            mb0Var.r(no6Var.J, no6Var.K, true);
            mb0Var.o("thumb://" + i3 + ":" + str2, null, aob.R4);
        }
        File file = new File(str2);
        this.c.setText(file.getName());
        xb4.D(file);
        this.d.setVisibility(8);
        StringBuilder sb = new StringBuilder();
        if (i2 != 0 && i != 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            Locale locale = Locale.US;
            sb.append(i2 + "x" + i);
        }
        if (no6Var.b) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(hl.g0(no6Var.E, false, false));
        }
        if (j != 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(hl.i0(j, false, false));
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append(ob6.D0().y0().format(no6Var.D));
        this.e.setText(sb);
        this.a.setVisibility(8);
    }

    @Override // snb
    public final void updateColors() {
        try {
            this.h.setProgressColor(aob.v0(aob.zi, this.M));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // jq3
    public final void l(long j, long j2) {
    }
}
