package th;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.v20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.ky;
import org.telegram.ui.ly;
import org.telegram.ui.or0;
import org.telegram.ui.un;
import org.telegram.ui.yw0;
import vh.k9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class s6 extends FrameLayout implements View.OnClickListener {
    public final org.telegram.ui.Components.t5 D;
    public final Path E;
    public Bitmap F;
    public boolean G;
    public q6 a;
    public q6 b;
    public vh.p2 c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f;
    public final View h;
    public final org.telegram.ui.ActionBar.p6 n;
    public ArrayList r;
    public final Rect s;
    public final RectF w;
    public final Paint x;
    public final org.telegram.ui.Components.t5 y;

    public s6(Context context, View view, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.a = null;
        this.b = null;
        this.c = null;
        this.e = new Matrix();
        this.f = new float[2];
        this.s = new Rect();
        this.w = new RectF();
        Paint paint = new Paint(1);
        this.x = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.E = new Path();
        this.G = false;
        this.h = view;
        this.n = p6Var;
        this.y = new org.telegram.ui.Components.t5(view, 0L, 120L, new LinearInterpolator());
        this.D = new org.telegram.ui.Components.t5(view, 0L, 360L, gr.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(vh.n5 n5Var) {
        if (n5Var == null || n5Var.T0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < n5Var.T0.size(); i10++) {
            if (((v20) n5Var.T0.get(i10)).M instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                arrayList.add(((v20) n5Var.T0.get(i10)).M);
            }
        }
        return arrayList;
    }

    public abstract void b(boolean z10);

    public final void c(TL_stories.StoryItem storyItem, ArrayList arrayList, ly lyVar) {
        FrameLayout frameLayout;
        View view;
        ArrayList arrayList2 = this.r;
        if (arrayList == arrayList2 && (arrayList == null || arrayList2 == null || arrayList.size() == this.r.size())) {
            return;
        }
        vh.p2 p2Var = this.c;
        if (p2Var != null) {
            p2Var.e(true);
            this.c = null;
        }
        int i10 = 0;
        while (true) {
            int childCount = getChildCount();
            frameLayout = this.d;
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt != frameLayout) {
                removeView(childAt);
                i10--;
            }
            i10++;
        }
        this.b = null;
        this.D.e(true, 0.0f);
        invalidate();
        b(false);
        this.r = arrayList;
        if (arrayList == null) {
            return;
        }
        this.G = false;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i11);
            if (mediaArea != null && mediaArea.coordinates != null) {
                if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    v6 v6Var = new v6(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, lyVar);
                    if (storyItem != null) {
                        v6Var.c(storyItem.views, false);
                    }
                    w7.e6.a(v6Var);
                    view = v6Var;
                } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                    TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                    k9 k9Var = new k9();
                    k9Var.c = tL_mediaAreaWeather.emoji;
                    k9Var.d = (float) tL_mediaAreaWeather.temperature_c;
                    jg.y0 y0Var = new jg.y0(getContext(), org.telegram.messenger.i0.p);
                    y0Var.setMaxWidth(org.telegram.messenger.i0.q.x);
                    y0Var.setIsVideo(true);
                    y0Var.d(d20.s0, k9Var.c);
                    y0Var.setText(k9Var.a());
                    y0Var.e(3, tL_mediaAreaWeather.color);
                    view = new r6(getContext(), y0Var, mediaArea);
                } else {
                    view = new q6(getContext(), this.h, mediaArea);
                }
                view.setOnClickListener(this);
                addView(view);
                double d = mediaArea.coordinates.w;
            }
        }
        frameLayout.bringToFront();
    }

    public final void d(TL_stories.StoryItem storyItem, ly lyVar) {
        c(storyItem, storyItem != null ? storyItem.media_areas : null, lyVar);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Canvas canvas2;
        RectF rectF;
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            q6 q6Var = this.b;
            float d = this.y.d((q6Var == null || !q6Var.s || q6Var.x) ? false : true);
            q6 q6Var2 = this.b;
            boolean z10 = q6Var2 != null && q6Var2.x;
            float d10 = this.D.d(z10);
            RectF rectF2 = this.w;
            if (d > 0.0f) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), zs.e4, 31);
                canvas2.drawColor(org.telegram.ui.ActionBar.t6.r1(d, 402653184));
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != frameLayout) {
                        org.telegram.ui.Components.t5 t5Var = ((q6) childAt).a;
                        q6 q6Var3 = this.b;
                        float d11 = t5Var.d(childAt == q6Var3 && q6Var3.s);
                        if (d11 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i11 = (int) (d11 * 255.0f);
                            Paint paint = this.x;
                            paint.setAlpha(i11);
                            canvas2.drawRoundRect(rectF, rectF.height() * 0.2f, rectF.height() * 0.2f, paint);
                            canvas2.restore();
                        }
                    }
                }
                canvas2.restore();
            } else {
                canvas2 = canvas;
                rectF = rectF2;
            }
            if ((z10 || d10 > 0.0f) && this.a != null) {
                if (this.F == null) {
                    this.F = ((e2) this).I.getPlayingBitmap();
                }
                if (this.F != null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.t6.r1(d10, 805306368));
                    canvas2.save();
                    Path path = this.E;
                    path.rewind();
                    rectF.set(this.a.getX(), this.a.getY(), this.a.getX() + this.a.getMeasuredWidth(), this.a.getY() + this.a.getMeasuredHeight());
                    q6 q6Var4 = this.a;
                    float T1 = org.telegram.messenger.i0.T1(1.0f, (q6Var4.y ? q6Var4.r.a(0.05f) : 1.0f) * 1.05f, d10);
                    canvas2.scale(T1, T1, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.a.b.coordinates;
                    float measuredWidth = (mediaAreaCoordinates.flags & 1) != 0 ? (float) ((mediaAreaCoordinates.radius / 100.0d) * r5.getMeasuredWidth()) : r5.getMeasuredHeight() * 0.2f;
                    path.addRoundRect(rectF, measuredWidth, measuredWidth, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = org.telegram.messenger.i0.P;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    int width = this.F.getWidth();
                    int height = this.F.getHeight();
                    Rect rect = this.s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.F, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.a.getX(), this.a.getY());
                    canvas2.rotate(this.a.getRotation(), this.a.getPivotX(), this.a.getPivotY());
                    canvas2.scale(this.a.getScaleX() * T1, this.a.getScaleY() * T1, this.a.getPivotX(), this.a.getPivotY());
                    this.a.b(canvas2);
                    canvas2.restore();
                }
            } else {
                Bitmap bitmap = this.F;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.F = null;
                }
            }
            invalidate();
        } else if (view instanceof q6) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((q6) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        if (this.G) {
            return;
        }
        this.G = true;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q6) {
                q6 q6Var = (q6) childAt;
                sg.v vVar = q6Var.H;
                if (q6Var.w) {
                    org.telegram.messenger.i0.r(vVar);
                    org.telegram.messenger.i0.h3(vVar, 400L);
                }
            }
        }
    }

    public Bitmap getPlayingBitmap() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x040d  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        q6 q6Var;
        float f7;
        float f10;
        ArrayList arrayList;
        float f11;
        float f12;
        boolean z12;
        if (view instanceof q6) {
            float f13 = 2.0f;
            if (view instanceof v6) {
                v6 v6Var = (v6) view;
                TL_stories.MediaArea mediaArea = v6Var.b;
                z2 z2Var = ((e2) this).I;
                boolean z13 = z2Var.l1;
                y2 y2Var = z2Var.x1;
                if (!z13 && y2Var.a != null) {
                    sg.o0 d = sg.o0.d(mediaArea.reaction);
                    if (!d.equals(sg.o0.d(y2Var.a.sent_reaction))) {
                        z2Var.J0(d);
                    }
                }
                v6Var.performHapticFeedback(3);
                v6Var.K.a.P0(false);
                ly lyVar = z2Var.T0;
                Random random = lyVar.h;
                FrameLayout frameLayout = lyVar.G;
                ArrayList arrayList2 = lyVar.F;
                if (arrayList2.size() > 12) {
                    return;
                }
                sg.o0 d10 = sg.o0.d(mediaArea.reaction);
                String str = d10.f;
                if (str == null) {
                    str = jj.U(org.telegram.ui.Components.f5.e(lyVar.b, d10.g));
                }
                float measuredHeight = v6Var.getMeasuredHeight();
                float measuredWidth = v6Var.getMeasuredWidth();
                View view2 = (View) v6Var.getParent();
                if (measuredWidth > view2.getWidth() * 0.5f) {
                    f10 = 0.4f * view2.getWidth();
                    f7 = f10;
                } else {
                    f7 = measuredHeight;
                    f10 = measuredWidth;
                }
                String p5 = ly.p(str);
                int hashCode = v6Var.hashCode();
                boolean z14 = v6Var.getTranslationX() > ((float) frameLayout.getMeasuredWidth()) / 2.0f;
                if (d10.f != null) {
                    arrayList = arrayList2;
                    f11 = f10;
                    f12 = f7;
                    z12 = z14;
                    if (lyVar.d(p5, hashCode, null, null, -1, false, false, f10, f7, z14)) {
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        ky kyVar = (ky) i0.a.g(1, arrayList);
                        kyVar.getClass();
                        kyVar.e = f12;
                        kyVar.d = f11;
                        kyVar.a = v6Var.getTranslationX() - (kyVar.d / 2.0f);
                        float translationY = v6Var.getTranslationY();
                        float f14 = kyVar.d;
                        kyVar.b = translationY - (1.5f * f14);
                        if (kyVar.m) {
                            kyVar.a = ((-f14) * 1.8f) + kyVar.a;
                            return;
                        } else {
                            kyVar.a = ((-f14) * 0.2f) + kyVar.a;
                            return;
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    f11 = f10;
                    f12 = f7;
                    z12 = z14;
                }
                if (d10.g == 0 || v6Var.getAnimatedEmojiDrawable() == null) {
                    return;
                }
                int i10 = 0;
                int i11 = 0;
                while (i10 < arrayList.size()) {
                    float f15 = f13;
                    Random random2 = random;
                    if (((ky) arrayList.get(i10)).k == d10.g) {
                        i11++;
                    }
                    i10++;
                    random = random2;
                    f13 = f15;
                }
                Random random3 = random;
                float f16 = f13;
                if (i11 >= 4) {
                    return;
                }
                ky kyVar2 = new ky();
                kyVar2.j = sg.d.a(v6Var.getAnimatedEmojiDrawable(), true, true);
                if (!kyVar2.i) {
                    kyVar2.f = ((random3.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                    kyVar2.g = ((random3.nextInt() % 101) / 100.0f) * (f12 / 4.0f);
                }
                kyVar2.p = hashCode;
                kyVar2.q = null;
                kyVar2.k = d10.g;
                kyVar2.m = z12;
                kyVar2.e = f12;
                kyVar2.d = f11;
                kyVar2.a = v6Var.getTranslationX() - (kyVar2.d / f16);
                float translationY2 = v6Var.getTranslationY();
                float f17 = kyVar2.d;
                kyVar2.b = translationY2 - (1.5f * f17);
                kyVar2.a = ((-f17) * 1.8f) + kyVar2.a;
                if (lyVar.n) {
                    kyVar2.j.f(frameLayout);
                }
                arrayList.add(kyVar2);
                return;
            }
            if (this.b == view) {
                org.telegram.messenger.i0.h3(new sg.v(this, 20), 200L);
                TL_stories.MediaArea mediaArea2 = this.b.b;
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaChannelPost) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).channel_id);
                    bundle.putInt("message_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).msg_id);
                    ((e2) this).H.V(new un(bundle));
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaUrl) {
                    gf.f.r(getContext(), ((TL_stories.TL_mediaAreaUrl) this.b.b).url);
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaStarGift) {
                    String str2 = ((TL_stories.TL_mediaAreaStarGift) mediaArea2).slug;
                    gf.f.r(getContext(), "https://" + vp.r1(d20.s0).U2 + "/nft/" + str2);
                    this.b = null;
                    invalidate();
                    return;
                }
                yw0 yw0Var = new yw0(r4, 1);
                yw0Var.y = true;
                yw0Var.U0 = this.b.b;
                yw0Var.setResourceProvider(this.n);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                TL_stories.MediaArea mediaArea3 = this.b.b;
                if (mediaArea3 instanceof TL_stories.TL_mediaAreaVenue) {
                    TL_stories.TL_mediaAreaVenue tL_mediaAreaVenue = (TL_stories.TL_mediaAreaVenue) mediaArea3;
                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                    tL_messageMediaVenue.venue_id = tL_mediaAreaVenue.venue_id;
                    tL_messageMediaVenue.venue_type = tL_mediaAreaVenue.venue_type;
                    tL_messageMediaVenue.title = tL_mediaAreaVenue.title;
                    tL_messageMediaVenue.address = tL_mediaAreaVenue.address;
                    tL_messageMediaVenue.provider = tL_mediaAreaVenue.provider;
                    tL_messageMediaVenue.geo = tL_mediaAreaVenue.geo;
                    tL_message.media = tL_messageMediaVenue;
                } else if (!(mediaArea3 instanceof TL_stories.TL_mediaAreaGeoPoint)) {
                    this.b = null;
                    invalidate();
                    return;
                } else {
                    yw0Var.V0 = true;
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = ((TL_stories.TL_mediaAreaGeoPoint) mediaArea3).geo;
                    tL_message.media = tL_messageMediaGeo;
                }
                yw0Var.W0 = false;
                yw0Var.H0(new jj(d20.s0, tL_message, false, false));
                ((e2) this).H.V(yw0Var);
                this.b = null;
                invalidate();
                return;
            }
            q6 q6Var2 = (q6) view;
            this.a = q6Var2;
            this.b = q6Var2;
            invalidate();
            vh.p2 p2Var = this.c;
            if (p2Var != null) {
                p2Var.e(true);
                this.c = null;
            }
            vh.p2 p2Var2 = new vh.p2(getContext(), 0);
            Paint paint = new Paint(1);
            p2Var2.b0 = paint;
            paint.setPathEffect(new CornerPathEffect(p2Var2.w));
            org.telegram.ui.Cells.y yVar = new org.telegram.ui.Cells.y(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{687865855}), null, new jg.x0(p2Var2, 8));
            p2Var2.a0 = yVar;
            yVar.setCallback(p2Var2);
            p2Var2.m(0.0f, this.b.getTranslationX() - org.telegram.messenger.i0.L(8.0f));
            p2Var2.d = 5000L;
            this.c = p2Var2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_stories.MediaArea mediaArea4 = this.b.b;
            if (mediaArea4 instanceof TL_stories.TL_mediaAreaChannelPost) {
                spannableStringBuilder.append((CharSequence) cd.L0(2131744473, null));
            } else if (mediaArea4 instanceof TL_stories.TL_mediaAreaStarGift) {
                spannableStringBuilder.append((CharSequence) cd.L0(2131744475, null));
            } else {
                if (mediaArea4 instanceof TL_stories.TL_mediaAreaUrl) {
                    p2Var2.p(true);
                    spannableStringBuilder.append((CharSequence) cd.L0(2131744612, null));
                    spannableStringBuilder.append((CharSequence) "\n");
                    TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = (TL_stories.TL_mediaAreaUrl) this.b.b;
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(TextUtils.ellipsize(tL_mediaAreaUrl.url, this.c.getTextPaint(), org.telegram.messenger.i0.q.x * 0.6f, TextUtils.TruncateAt.END));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.t6.r1(0.6f, -1)), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new or0(1), length, spannableStringBuilder.length(), 33);
                    p2Var2.k(11.0f, 7.0f, 11.0f, 7.0f);
                    z10 = true;
                    SpannableString spannableString = new SpannableString(">");
                    dq dqVar = new dq(R.drawable.photos_arrow, 0);
                    float L = org.telegram.messenger.i0.L(!z10 ? 1.0f : 2.0f);
                    float L2 = org.telegram.messenger.i0.L(!z10 ? 0.0f : 1.0f);
                    dqVar.r = L;
                    dqVar.s = L2;
                    spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
                    SpannableString spannableString2 = new SpannableString("<");
                    dq dqVar2 = new dq(R.drawable.attach_arrow_right, 0);
                    float L3 = org.telegram.messenger.i0.L(!z10 ? -1.0f : -2.0f);
                    float L4 = org.telegram.messenger.i0.L(z10 ? 0.0f : 1.0f);
                    dqVar2.r = L3;
                    dqVar2.s = L4;
                    dqVar2.H = -1.0f;
                    dqVar2.I = 1.0f;
                    spannableString2.setSpan(dqVar2, 0, spannableString2.length(), 33);
                    if (org.telegram.messenger.i0.L1(spannableStringBuilder)) {
                        spannableString = spannableString2;
                    }
                    org.telegram.messenger.i0.J2(spannableStringBuilder, spannableString, ">");
                    p2Var2.s(spannableStringBuilder);
                    p2Var2.l0 = new o0(23, this, p2Var2);
                    float f18 = !z10 ? 100 : 50;
                    z11 = this.b.getTranslationY() - ((float) org.telegram.messenger.i0.L(f18)) >= ((float) org.telegram.messenger.i0.L(100.0f));
                    p2Var2.a = z11 ? 1 : 3;
                    q6Var = this.b;
                    if (!(q6Var.b instanceof TL_stories.TL_mediaAreaChannelPost) && (!z11 ? (q6Var.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.i0.L(f18) >= org.telegram.messenger.i0.L(120.0f) : (this.b.getMeasuredHeight() / 2.0f) + q6Var.getTranslationY() <= getMeasuredHeight() - org.telegram.messenger.i0.L(120.0f))) {
                        p2Var2.setTranslationY(this.b.getTranslationY() - (this.b.getMeasuredHeight() / 3.0f));
                    } else if (z11) {
                        p2Var2.setTranslationY((this.b.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - org.telegram.messenger.i0.L(f18));
                    } else {
                        p2Var2.setTranslationY((this.b.getMeasuredHeight() / 2.0f) + this.b.getTranslationY());
                    }
                    p2Var2.setOnClickListener(new rh.s(this, 14));
                    p2Var2.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
                    this.d.addView(p2Var2, w7.b6.c(f18, -1));
                    p2Var2.u();
                    b(true);
                }
                spannableStringBuilder.append((CharSequence) cd.L0(2131744474, null));
            }
            z10 = false;
            SpannableString spannableString3 = new SpannableString(">");
            dq dqVar3 = new dq(R.drawable.photos_arrow, 0);
            float L5 = org.telegram.messenger.i0.L(!z10 ? 1.0f : 2.0f);
            float L22 = org.telegram.messenger.i0.L(!z10 ? 0.0f : 1.0f);
            dqVar3.r = L5;
            dqVar3.s = L22;
            spannableString3.setSpan(dqVar3, 0, spannableString3.length(), 33);
            SpannableString spannableString22 = new SpannableString("<");
            dq dqVar22 = new dq(R.drawable.attach_arrow_right, 0);
            float L32 = org.telegram.messenger.i0.L(!z10 ? -1.0f : -2.0f);
            float L42 = org.telegram.messenger.i0.L(z10 ? 0.0f : 1.0f);
            dqVar22.r = L32;
            dqVar22.s = L42;
            dqVar22.H = -1.0f;
            dqVar22.I = 1.0f;
            spannableString22.setSpan(dqVar22, 0, spannableString22.length(), 33);
            if (org.telegram.messenger.i0.L1(spannableStringBuilder)) {
            }
            org.telegram.messenger.i0.J2(spannableStringBuilder, spannableString3, ">");
            p2Var2.s(spannableStringBuilder);
            p2Var2.l0 = new o0(23, this, p2Var2);
            float f182 = !z10 ? 100 : 50;
            if (this.b.getTranslationY() - ((float) org.telegram.messenger.i0.L(f182)) >= ((float) org.telegram.messenger.i0.L(100.0f))) {
            }
            p2Var2.a = z11 ? 1 : 3;
            q6Var = this.b;
            if (!(q6Var.b instanceof TL_stories.TL_mediaAreaChannelPost)) {
            }
            if (z11) {
            }
            p2Var2.setOnClickListener(new rh.s(this, 14));
            p2Var2.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
            this.d.addView(p2Var2, w7.b6.c(f182, -1));
            p2Var2.u();
            b(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.F;
        if (bitmap != null) {
            bitmap.recycle();
            this.F = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt == this.d) {
                childAt.layout(0, 0, i12 - i10, i13 - i11);
            } else if (childAt instanceof q6) {
                q6 q6Var = (q6) childAt;
                TL_stories.MediaArea mediaArea = q6Var.b;
                int measuredWidth = q6Var.getMeasuredWidth();
                int measuredHeight = q6Var.getMeasuredHeight();
                q6Var.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                q6Var.setTranslationX((float) ((mediaArea.coordinates.x / 100.0d) * getMeasuredWidth()));
                q6Var.setTranslationY((float) ((mediaArea.coordinates.y / 100.0d) * getMeasuredHeight()));
                q6Var.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof r6) {
                r6 r6Var = (r6) childAt;
                TL_stories.MediaArea mediaArea2 = r6Var.a;
                int measuredWidth2 = r6Var.getMeasuredWidth();
                int measuredHeight2 = r6Var.getMeasuredHeight();
                r6Var.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                r6Var.setTranslationX((float) ((mediaArea2.coordinates.x / 100.0d) * getMeasuredWidth()));
                r6Var.setTranslationY((float) ((mediaArea2.coordinates.y / 100.0d) * getMeasuredHeight()));
                r6Var.setRotation((float) mediaArea2.coordinates.rotation);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            FrameLayout frameLayout = this.d;
            if (childAt == frameLayout) {
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof q6) {
                q6 q6Var = (q6) getChildAt(i12);
                q6Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((q6Var.b.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((q6Var.b.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            } else if (childAt instanceof r6) {
                r6 r6Var = (r6) getChildAt(i12);
                r6Var.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((r6Var.a.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((r6Var.a.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        vh.p2 p2Var;
        if (getChildCount() == 0 || (p2Var = this.c) == null || !p2Var.V) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            vh.p2 p2Var2 = this.c;
            if (p2Var2 != null) {
                p2Var2.e(true);
                this.c = null;
            }
            this.b = null;
            invalidate();
            b(false);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
