// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class x6b extends FrameLayout implements View.OnClickListener {
    public final ln E;
    public final Path F;
    public Bitmap G;
    public boolean H;
    public v6b a;
    public v6b b;
    public hg5 c;
    public final FrameLayout d;
    public final Matrix e;
    public final float[] f;
    public final g48 h;
    public final r63 n;
    public ArrayList r;
    public final Rect s;
    public final RectF w;
    public final Paint x;
    public final ln y;

    public x6b(Context context, g48 g48Var, r63 r63Var) {
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
        this.F = new Path();
        this.H = false;
        this.h = g48Var;
        this.n = r63Var;
        this.y = new ln(g48Var, 0L, 120L, new LinearInterpolator());
        this.E = new ln(g48Var, 0L, 360L, d53.h);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout);
        setLayerType(2, null);
    }

    public static ArrayList a(g6b g6bVar) {
        if (g6bVar == null || g6bVar.T0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < g6bVar.T0.size(); i++) {
            if (((pcc) g6bVar.T0.get(i)).N instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                arrayList.add(((pcc) g6bVar.T0.get(i)).N);
            }
        }
        return arrayList;
    }

    public abstract void b(boolean z);

    public final void c(TL_stories.StoryItem storyItem, kw3 kw3Var) {
        d(storyItem, storyItem != null ? storyItem.media_areas : null, kw3Var);
    }

    public final void d(TL_stories.StoryItem storyItem, ArrayList arrayList, kw3 kw3Var) {
        FrameLayout frameLayout;
        View view;
        ArrayList arrayList2 = this.r;
        if (arrayList == arrayList2 && (arrayList == null || arrayList2 == null || arrayList.size() == this.r.size())) {
            return;
        }
        hg5 hg5Var = this.c;
        if (hg5Var != null) {
            hg5Var.f(true);
            this.c = null;
        }
        int i = 0;
        while (true) {
            int childCount = getChildCount();
            frameLayout = this.d;
            if (i >= childCount) {
                break;
            }
            View childAt = getChildAt(i);
            if (childAt != frameLayout) {
                removeView(childAt);
                i--;
            }
            i++;
        }
        this.b = null;
        this.E.e(true, 0.0f);
        invalidate();
        b(false);
        this.r = arrayList;
        if (arrayList == null) {
            return;
        }
        this.H = false;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TL_stories.MediaArea mediaArea = (TL_stories.MediaArea) arrayList.get(i2);
            if (mediaArea != null && mediaArea.coordinates != null) {
                if (mediaArea instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    e8b e8bVar = new e8b(getContext(), this, (TL_stories.TL_mediaAreaSuggestedReaction) mediaArea, kw3Var);
                    if (storyItem != null) {
                        e8bVar.c(storyItem.views, false);
                    }
                    rve.a(e8bVar);
                    view = e8bVar;
                } else if (mediaArea instanceof TL_stories.TL_mediaAreaWeather) {
                    TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = (TL_stories.TL_mediaAreaWeather) mediaArea;
                    iuc iucVar = new iuc();
                    iucVar.c = tL_mediaAreaWeather.emoji;
                    iucVar.d = (float) tL_mediaAreaWeather.temperature_c;
                    gd6 gd6Var = new gd6(getContext(), gm.p);
                    gd6Var.setMaxWidth(gm.q.x);
                    gd6Var.setIsVideo(true);
                    gd6Var.d(z8c.t0, iucVar.c);
                    gd6Var.setText(iucVar.a());
                    gd6Var.e(3, tL_mediaAreaWeather.color);
                    view = new w6b(getContext(), gd6Var, mediaArea);
                } else {
                    view = new v6b(getContext(), this.h, mediaArea);
                }
                view.setOnClickListener(this);
                addView(view);
                double d = mediaArea.coordinates.w;
            }
        }
        frameLayout.bringToFront();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Canvas canvas2;
        RectF rectF;
        float f;
        if (view == this.d) {
            v6b v6bVar = this.b;
            float d = this.y.d((v6bVar == null || !v6bVar.s || v6bVar.x) ? false : true);
            v6b v6bVar2 = this.b;
            boolean z = v6bVar2 != null && v6bVar2.x;
            float d2 = this.E.d(z);
            RectF rectF2 = this.w;
            if (d > 0.0f) {
                rectF = rectF2;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), nm7.d4, 31);
                canvas2.drawColor(cmb.p1(d, 402653184));
                for (int i = 0; i < getChildCount(); i++) {
                    View childAt = getChildAt(i);
                    if (childAt instanceof v6b) {
                        ln lnVar = ((v6b) childAt).a;
                        v6b v6bVar3 = this.b;
                        float d3 = lnVar.d(childAt == v6bVar3 && v6bVar3.s);
                        if (d3 > 0.0f) {
                            canvas2.save();
                            rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas2.rotate(childAt.getRotation(), rectF.centerX(), rectF.centerY());
                            int i2 = (int) (d3 * 255.0f);
                            Paint paint = this.x;
                            paint.setAlpha(i2);
                            canvas2.drawRoundRect(rectF, rectF.height() * 0.2f, rectF.height() * 0.2f, paint);
                            canvas2.restore();
                        }
                    }
                }
                f = 0.2f;
                canvas2.restore();
            } else {
                canvas2 = canvas;
                rectF = rectF2;
                f = 0.2f;
            }
            if ((z || d2 > 0.0f) && this.a != null) {
                Bitmap bitmap = this.G;
                if (bitmap == null) {
                    bitmap = ((e48) this).J.getPlayingBitmap();
                    this.G = bitmap;
                }
                if (bitmap != null) {
                    canvas2.drawColor(cmb.p1(d2, 805306368));
                    canvas2.save();
                    Path path = this.F;
                    path.rewind();
                    rectF.set(this.a.getX(), this.a.getY(), this.a.getX() + this.a.getMeasuredWidth(), this.a.getY() + this.a.getMeasuredHeight());
                    v6b v6bVar4 = this.a;
                    float R1 = gm.R1(1.0f, (v6bVar4.y ? v6bVar4.r.a(0.05f) : 1.0f) * 1.05f, d2);
                    canvas2.scale(R1, R1, rectF.centerX(), rectF.centerY());
                    canvas2.rotate(this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates = this.a.b.coordinates;
                    float measuredWidth = (mediaAreaCoordinates.flags & 1) != 0 ? (float) ((mediaAreaCoordinates.radius / 100.0d) * r5.getMeasuredWidth()) : r5.getMeasuredHeight() * f;
                    path.addRoundRect(rectF, measuredWidth, measuredWidth, Path.Direction.CW);
                    canvas2.clipPath(path);
                    RectF rectF3 = gm.P;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    int width = this.G.getWidth();
                    int height = this.G.getHeight();
                    Rect rect = this.s;
                    rect.set(0, 0, width, height);
                    canvas2.rotate(-this.a.getRotation(), rectF.centerX(), rectF.centerY());
                    canvas2.drawBitmap(this.G, rect, rectF3, (Paint) null);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(this.a.getX(), this.a.getY());
                    canvas2.rotate(this.a.getRotation(), this.a.getPivotX(), this.a.getPivotY());
                    canvas2.scale(this.a.getScaleX() * R1, this.a.getScaleY() * R1, this.a.getPivotX(), this.a.getPivotY());
                    this.a.b(canvas2);
                    canvas2.restore();
                }
            } else {
                Bitmap bitmap2 = this.G;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.G = null;
                }
            }
            invalidate();
        } else if (view instanceof v6b) {
            canvas.save();
            canvas.translate(view.getLeft(), view.getTop());
            canvas.concat(view.getMatrix());
            ((v6b) view).a(canvas);
            canvas.restore();
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e() {
        if (this.H) {
            return;
        }
        this.H = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof v6b) {
                v6b v6bVar = (v6b) childAt;
                nsa nsaVar = v6bVar.I;
                if (v6bVar.w) {
                    gm.r(nsaVar);
                    gm.d3(nsaVar, 400L);
                }
            }
        }
    }

    public Bitmap getPlayingBitmap() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0406  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        v6b v6bVar;
        float f;
        float f2;
        ArrayList arrayList;
        float f3;
        float f4;
        boolean z3;
        if (view instanceof v6b) {
            float f5 = 2.0f;
            if (view instanceof e8b) {
                e8b e8bVar = (e8b) view;
                TL_stories.MediaArea mediaArea = e8bVar.b;
                a58 a58Var = ((e48) this).J;
                boolean z4 = a58Var.s1;
                z48 z48Var = a58Var.E1;
                if (!z4 && z48Var.a != null) {
                    k39 d = k39.d(mediaArea.reaction);
                    if (!d.equals(k39.d(z48Var.a.sent_reaction))) {
                        a58Var.E0(d);
                    }
                }
                e8bVar.performHapticFeedback(3);
                e8bVar.L.a.w0(false);
                kw3 kw3Var = a58Var.a1;
                Random random = kw3Var.h;
                FrameLayout frameLayout = kw3Var.H;
                ArrayList arrayList2 = kw3Var.G;
                if (arrayList2.size() <= 12) {
                    k39 d2 = k39.d(mediaArea.reaction);
                    String str = d2.f;
                    if (str == null) {
                        str = k47.U(vm.e(kw3Var.b, d2.g));
                    }
                    float measuredHeight = e8bVar.getMeasuredHeight();
                    float measuredWidth = e8bVar.getMeasuredWidth();
                    View view2 = (View) e8bVar.getParent();
                    if (measuredWidth > view2.getWidth() * 0.5f) {
                        f2 = 0.4f * view2.getWidth();
                        f = f2;
                    } else {
                        f = measuredHeight;
                        f2 = measuredWidth;
                    }
                    String p = kw3.p(str);
                    int hashCode = e8bVar.hashCode();
                    boolean z5 = e8bVar.getTranslationX() > ((float) frameLayout.getMeasuredWidth()) / 2.0f;
                    if (d2.f != null) {
                        arrayList = arrayList2;
                        f3 = f2;
                        f4 = f;
                        z3 = z5;
                        if (kw3Var.d(p, hashCode, null, null, -1, false, false, f2, f, z5)) {
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            jw3 jw3Var = (jw3) b10.f(1, arrayList);
                            jw3Var.getClass();
                            jw3Var.e = f4;
                            jw3Var.d = f3;
                            jw3Var.a = e8bVar.getTranslationX() - (jw3Var.d / 2.0f);
                            float translationY = e8bVar.getTranslationY();
                            float f6 = jw3Var.d;
                            jw3Var.b = translationY - (1.5f * f6);
                            boolean z6 = jw3Var.m;
                            float f7 = jw3Var.a;
                            if (z6) {
                                jw3Var.a = ((-f6) * 1.8f) + f7;
                                return;
                            } else {
                                jw3Var.a = ((-f6) * 0.2f) + f7;
                                return;
                            }
                        }
                    } else {
                        arrayList = arrayList2;
                        f3 = f2;
                        f4 = f;
                        z3 = z5;
                    }
                    if (d2.g == 0 || e8bVar.getAnimatedEmojiDrawable() == null) {
                        return;
                    }
                    int i = 0;
                    int i2 = 0;
                    while (i < arrayList.size()) {
                        float f8 = f5;
                        ArrayList arrayList3 = arrayList;
                        if (((jw3) arrayList.get(i)).k == d2.g) {
                            i2++;
                        }
                        i++;
                        arrayList = arrayList3;
                        f5 = f8;
                    }
                    ArrayList arrayList4 = arrayList;
                    float f9 = f5;
                    if (i2 < 4) {
                        jw3 jw3Var2 = new jw3();
                        jw3Var2.j = xm.a(e8bVar.getAnimatedEmojiDrawable(), true, true);
                        if (!jw3Var2.i) {
                            jw3Var2.f = ((random.nextInt() % 101) / 100.0f) * (f3 / 4.0f);
                            jw3Var2.g = ((random.nextInt() % 101) / 100.0f) * (f4 / 4.0f);
                        }
                        jw3Var2.p = hashCode;
                        jw3Var2.q = null;
                        jw3Var2.k = d2.g;
                        jw3Var2.m = z3;
                        jw3Var2.e = f4;
                        jw3Var2.d = f3;
                        jw3Var2.a = e8bVar.getTranslationX() - (jw3Var2.d / f9);
                        float translationY2 = e8bVar.getTranslationY();
                        float f10 = jw3Var2.d;
                        jw3Var2.b = translationY2 - (1.5f * f10);
                        jw3Var2.a = ((-f10) * 1.8f) + jw3Var2.a;
                        if (kw3Var.n) {
                            jw3Var2.j.f(frameLayout);
                        }
                        arrayList4.add(jw3Var2);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.b == view) {
                gm.d3(new nsa((Object) this, (byte) 20), 200L);
                TL_stories.MediaArea mediaArea2 = this.b.b;
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaChannelPost) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).channel_id);
                    bundle.putInt("message_id", ((TL_stories.TL_mediaAreaChannelPost) this.b.b).msg_id);
                    ((e48) this).I.L(new yv1(bundle));
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaUrl) {
                    l11.u(getContext(), ((TL_stories.TL_mediaAreaUrl) this.b.b).url);
                    this.b = null;
                    invalidate();
                    return;
                }
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaStarGift) {
                    String str2 = ((TL_stories.TL_mediaAreaStarGift) mediaArea2).slug;
                    l11.u(getContext(), "https://" + oc7.r1(z8c.t0).N2 + "/nft/" + str2);
                    this.b = null;
                    invalidate();
                    return;
                }
                np8 np8Var = new np8(r5, (byte) 1);
                np8Var.w = true;
                np8Var.T0 = this.b.b;
                np8Var.setResourceProvider(this.n);
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
                    np8Var.U0 = true;
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = ((TL_stories.TL_mediaAreaGeoPoint) mediaArea3).geo;
                    tL_message.media = tL_messageMediaGeo;
                }
                np8Var.V0 = false;
                np8Var.G0(new k47(z8c.t0, tL_message, false, false));
                ((e48) this).I.L(np8Var);
                this.b = null;
                invalidate();
                return;
            }
            v6b v6bVar2 = (v6b) view;
            this.a = v6bVar2;
            this.b = v6bVar2;
            invalidate();
            hg5 hg5Var = this.c;
            if (hg5Var != null) {
                hg5Var.f(true);
                this.c = null;
            }
            hg5 hg5Var2 = new hg5(getContext(), 0);
            Paint paint = new Paint(1);
            hg5Var2.c0 = paint;
            paint.setPathEffect(new CornerPathEffect(hg5Var2.w));
            fg0 fg0Var = new fg0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{687865855}), null, new f6(hg5Var2, (byte) 4));
            hg5Var2.b0 = fg0Var;
            fg0Var.setCallback(hg5Var2);
            hg5Var2.o(0.0f, this.b.getTranslationX() - gm.L(8.0f));
            hg5Var2.d = 5000L;
            this.c = hg5Var2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_stories.MediaArea mediaArea4 = this.b.b;
            if (mediaArea4 instanceof TL_stories.TL_mediaAreaChannelPost) {
                spannableStringBuilder.append((CharSequence) jb6.M0(2131744133, null));
            } else if (mediaArea4 instanceof TL_stories.TL_mediaAreaStarGift) {
                spannableStringBuilder.append((CharSequence) jb6.M0(2131744135, null));
            } else {
                if (mediaArea4 instanceof TL_stories.TL_mediaAreaUrl) {
                    hg5Var2.p(true);
                    spannableStringBuilder.append((CharSequence) jb6.M0(2131744279, null));
                    spannableStringBuilder.append((CharSequence) "\n");
                    TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = (TL_stories.TL_mediaAreaUrl) this.b.b;
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(TextUtils.ellipsize(tL_mediaAreaUrl.url, this.c.getTextPaint(), gm.q.x * 0.6f, TextUtils.TruncateAt.END));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(cmb.p1(0.6f, -1)), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.setSpan(new bb8((byte) 1), length, spannableStringBuilder.length(), 33);
                    hg5Var2.m(11.0f, 7.0f, 11.0f, 7.0f);
                    z = true;
                    SpannableString spannableString = new SpannableString(">");
                    pn2 pn2Var = new pn2(R.drawable.photos_arrow, 0);
                    float L = gm.L(!z ? 1.0f : 2.0f);
                    float L2 = gm.L(!z ? 0.0f : 1.0f);
                    pn2Var.r = L;
                    pn2Var.s = L2;
                    spannableString.setSpan(pn2Var, 0, spannableString.length(), 33);
                    SpannableString spannableString2 = new SpannableString("<");
                    pn2 pn2Var2 = new pn2(R.drawable.attach_arrow_right, 0);
                    float L3 = gm.L(!z ? -1.0f : -2.0f);
                    float L4 = gm.L(z ? 0.0f : 1.0f);
                    pn2Var2.r = L3;
                    pn2Var2.s = L4;
                    pn2Var2.I = -1.0f;
                    pn2Var2.J = 1.0f;
                    spannableString2.setSpan(pn2Var2, 0, spannableString2.length(), 33);
                    if (gm.J1(spannableStringBuilder)) {
                        spannableString = spannableString2;
                    }
                    gm.G2(spannableStringBuilder, spannableString, ">");
                    hg5Var2.t(spannableStringBuilder);
                    hg5Var2.r0 = new uva(this, hg5Var2, (byte) 29);
                    float f11 = !z ? 100 : 50;
                    z2 = this.b.getTranslationY() - ((float) gm.L(f11)) < ((float) gm.L(100.0f));
                    hg5Var2.a = z2 ? (byte) 1 : (byte) 3;
                    v6bVar = this.b;
                    if ((v6bVar.b instanceof TL_stories.TL_mediaAreaChannelPost) || (!z2 ? (v6bVar.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - gm.L(f11) < gm.L(120.0f) : (this.b.getMeasuredHeight() / 2.0f) + v6bVar.getTranslationY() > getMeasuredHeight() - gm.L(120.0f))) {
                        v6b v6bVar3 = this.b;
                        if (z2) {
                            hg5Var2.setTranslationY((v6bVar3.getTranslationY() - (this.b.getMeasuredHeight() / 2.0f)) - gm.L(f11));
                        } else {
                            hg5Var2.setTranslationY((this.b.getMeasuredHeight() / 2.0f) + v6bVar3.getTranslationY());
                        }
                    } else {
                        hg5Var2.setTranslationY(this.b.getTranslationY() - (this.b.getMeasuredHeight() / 3.0f));
                    }
                    hg5Var2.setOnClickListener(new oha(this, (byte) 16));
                    hg5Var2.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
                    this.d.addView(hg5Var2, qoe.c(f11, -1));
                    hg5Var2.v();
                    b(true);
                }
                spannableStringBuilder.append((CharSequence) jb6.M0(2131744134, null));
            }
            z = false;
            SpannableString spannableString3 = new SpannableString(">");
            pn2 pn2Var3 = new pn2(R.drawable.photos_arrow, 0);
            float L5 = gm.L(!z ? 1.0f : 2.0f);
            float L22 = gm.L(!z ? 0.0f : 1.0f);
            pn2Var3.r = L5;
            pn2Var3.s = L22;
            spannableString3.setSpan(pn2Var3, 0, spannableString3.length(), 33);
            SpannableString spannableString22 = new SpannableString("<");
            pn2 pn2Var22 = new pn2(R.drawable.attach_arrow_right, 0);
            float L32 = gm.L(!z ? -1.0f : -2.0f);
            float L42 = gm.L(z ? 0.0f : 1.0f);
            pn2Var22.r = L32;
            pn2Var22.s = L42;
            pn2Var22.I = -1.0f;
            pn2Var22.J = 1.0f;
            spannableString22.setSpan(pn2Var22, 0, spannableString22.length(), 33);
            if (gm.J1(spannableStringBuilder)) {
            }
            gm.G2(spannableStringBuilder, spannableString3, ">");
            hg5Var2.t(spannableStringBuilder);
            hg5Var2.r0 = new uva(this, hg5Var2, (byte) 29);
            float f112 = !z ? 100 : 50;
            if (this.b.getTranslationY() - ((float) gm.L(f112)) < ((float) gm.L(100.0f))) {
            }
            hg5Var2.a = z2 ? (byte) 1 : (byte) 3;
            v6bVar = this.b;
            if (v6bVar.b instanceof TL_stories.TL_mediaAreaChannelPost) {
            }
            v6b v6bVar32 = this.b;
            if (z2) {
            }
            hg5Var2.setOnClickListener(new oha(this, (byte) 16));
            hg5Var2.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
            this.d.addView(hg5Var2, qoe.c(f112, -1));
            hg5Var2.v();
            b(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.G;
        if (bitmap != null) {
            bitmap.recycle();
            this.G = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt == this.d) {
                childAt.layout(0, 0, i3 - i, i4 - i2);
            } else if (childAt instanceof v6b) {
                v6b v6bVar = (v6b) childAt;
                TL_stories.MediaArea mediaArea = v6bVar.b;
                int measuredWidth = v6bVar.getMeasuredWidth();
                int measuredHeight = v6bVar.getMeasuredHeight();
                v6bVar.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                v6bVar.setTranslationX((float) ((mediaArea.coordinates.x / 100.0d) * getMeasuredWidth()));
                v6bVar.setTranslationY((float) ((mediaArea.coordinates.y / 100.0d) * getMeasuredHeight()));
                v6bVar.setRotation((float) mediaArea.coordinates.rotation);
            } else if (childAt instanceof w6b) {
                w6b w6bVar = (w6b) childAt;
                TL_stories.MediaArea mediaArea2 = w6bVar.a;
                int measuredWidth2 = w6bVar.getMeasuredWidth();
                int measuredHeight2 = w6bVar.getMeasuredHeight();
                w6bVar.layout((-measuredWidth2) / 2, (-measuredHeight2) / 2, measuredWidth2 / 2, measuredHeight2 / 2);
                w6bVar.setTranslationX((float) ((mediaArea2.coordinates.x / 100.0d) * getMeasuredWidth()));
                w6bVar.setTranslationY((float) ((mediaArea2.coordinates.y / 100.0d) * getMeasuredHeight()));
                w6bVar.setRotation((float) mediaArea2.coordinates.rotation);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            FrameLayout frameLayout = this.d;
            if (childAt == frameLayout) {
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else if (childAt instanceof v6b) {
                v6b v6bVar = (v6b) getChildAt(i3);
                v6bVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((v6bVar.b.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((v6bVar.b.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            } else if (childAt instanceof w6b) {
                w6b w6bVar = (w6b) getChildAt(i3);
                w6bVar.measure(View.MeasureSpec.makeMeasureSpec((int) Math.ceil((w6bVar.a.coordinates.w / 100.0d) * size), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.ceil((w6bVar.a.coordinates.h / 100.0d) * size2), TLObject.FLAG_30));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        hg5 hg5Var;
        if (getChildCount() == 0 || (hg5Var = this.c) == null || !hg5Var.W) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            hg5 hg5Var2 = this.c;
            if (hg5Var2 != null) {
                hg5Var2.f(true);
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
