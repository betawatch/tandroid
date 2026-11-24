// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class r19 extends FrameLayout implements vlb {
    public static final p57 I;
    public static final p57 J;
    public static final p57 K;
    public static final p57 L;
    public long E;
    public final u82 F;
    public float G;
    public ValueAnimator H;
    public boolean a;
    public final int b;
    public final q19 c;
    public final dg0 d;
    public final lka e;
    public final bf0 f;
    public final bf0 h;
    public int n;
    public final pc0 r;
    public final View s;
    public final d0b w;
    public final ylb x;
    public final boolean y;

    static {
        int i = cmb.x6;
        I = new p57(R.drawable.msg_mini_checks, i);
        p57 p57Var = new p57(R.drawable.msg_reactions, i);
        p57Var.g = 16;
        p57Var.h = 16;
        p57Var.i = 5.66f;
        J = p57Var;
        int i2 = cmb.Xk;
        K = new p57(R.drawable.mini_repost_story, i2);
        L = new p57(R.drawable.mini_forward_story, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r19(int i, int i2, ylb ylbVar, Context context, boolean z, boolean z2) {
        super(context);
        float f;
        float f2;
        this.r = new pc0((ylb) null);
        this.G = 1.0f;
        this.y = i;
        this.b = i2;
        this.x = ylbVar;
        this.F = new u82(this, ylbVar);
        setLayoutParams(new g69(-1, gm.L(50.0f)));
        int i3 = i == 1 ? 48 : 34;
        q19 q19Var = new q19(this, context, i);
        this.c = q19Var;
        float f3 = i3;
        q19Var.setRoundRadius(gm.L(f3));
        addView(q19Var, qoe.i(f3, f3, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i == 1) {
            setClipChildren(false);
        }
        dg0 dg0Var = new dg0(context, (byte) 4);
        this.d = dg0Var;
        nm7.i(dg0Var);
        dg0Var.setTextSize(16);
        anb.W(dg0Var, cmb.D8, ylbVar);
        dg0Var.setEllipsizeByGradient(true);
        dg0Var.setImportantForAccessibility(2);
        dg0Var.setRightPadding(gm.L(30.0f));
        dg0Var.setTranslationX(jb6.a0 ? gm.L(30.0f) : 0.0f);
        dg0Var.setRightDrawableOutside(true);
        if (i == 1) {
            f = 7.66f;
            f2 = 73.0f;
        } else {
            f = 5.33f;
            f2 = 55.0f;
        }
        float f4 = f2;
        addView(dg0Var, qoe.i(-1.0f, -2.0f, 55, f4, f, 12.0f, 0.0f));
        d0b d0bVar = new d0b(this);
        this.w = d0bVar;
        dg0Var.setDrawablePadding(gm.L(3.0f));
        dg0Var.i(d0bVar.a);
        lka lkaVar = new lka(context);
        this.e = lkaVar;
        lkaVar.setTextSize(13);
        anb.W(lkaVar, cmb.x6, ylbVar);
        lkaVar.setEllipsizeByGradient(true);
        lkaVar.setImportantForAccessibility(2);
        lkaVar.setTranslationX(jb6.a0 ? gm.L(30.0f) : 0.0f);
        addView(lkaVar, qoe.i(-1.0f, -2.0f, 55, f4, i == 1 ? 24.0f : 19.0f, 20.0f, 0.0f));
        if (z2) {
            bf0 bf0Var = new bf0(context);
            this.f = bf0Var;
            addView(bf0Var, qoe.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            bf0 bf0Var2 = new bf0(context);
            this.h = bf0Var2;
            addView(bf0Var2, qoe.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z) {
            View view = new View(context);
            this.s = view;
            view.setBackground(cmb.L0(false));
            addView(view, qoe.c(-1.0f, -1));
        }
    }

    public final void a(boolean z, float f) {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.H = null;
        }
        if (!z) {
            this.G = f;
            invalidate();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, f);
        this.H = ofFloat;
        ofFloat.addUpdateListener(new fx7(this, (byte) 25));
        this.H.addListener(new t7(this, f, (byte) 6));
        this.H.setInterpolator(d53.h);
        this.H.setDuration(420L);
        this.H.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0053, code lost:
    
        if (r1 != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r1 != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0199  */
    /* JADX WARN: Type inference failed for: r19v0, types: [android.view.View, r19] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.graphics.drawable.BitmapDrawable] */
    /* JADX WARN: Type inference failed for: r1v47, types: [android.graphics.drawable.BitmapDrawable] */
    /* JADX WARN: Type inference failed for: r21v0, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, lka] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TLRPC.User user, TLRPC.Chat chat, TLRPC.Reaction reaction, boolean z, long j, TL_stories.StoryItem storyItem, boolean z2, boolean z3, boolean z4) {
        String a0;
        boolean z5;
        boolean z6;
        String str;
        long j2;
        long j3;
        float f;
        float f2;
        TL_stories.StoryFwdHeader storyFwdHeader;
        pc0 pc0Var;
        TLRPC.User user2 = user == null ? chat : user;
        if (user2 == null) {
            return;
        }
        int i = this.y ? cmb.F6 : cmb.y9;
        ylb ylbVar = this.x;
        this.w.b(user, chat, cmb.v0(i, ylbVar), false);
        pc0 pc0Var2 = this.r;
        pc0Var2.o(user2);
        dg0 dg0Var = this.d;
        if (user == null) {
            this.E = -chat.id;
            dg0Var.k(chat.title);
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            if (chatPhoto != null) {
                ?? r1 = chatPhoto.strippedBitmap;
                pc0Var = r1;
            }
            int i2 = this.b;
            this.c.m(gn5.m(i2, 1, user2), "50_50", pc0Var2, user2);
            bf0 bf0Var = this.f;
            if (!z) {
            }
            bf0 bf0Var2 = this.h;
            if (storyItem == null) {
            }
            j3 = j;
            if (j3 != j2) {
            }
            setContentDescription(a0);
            f = 0.0f;
            ?? r6 = this.e;
            if (j3 != j2) {
            }
            dg0Var.setRightPadding(gm.L(z5 ? 30.0f : 0.0f));
            dg0Var.setTranslationX((z5 || !jb6.a0) ? 0.0f : gm.L(30.0f));
            ((ViewGroup.MarginLayoutParams) r6.getLayoutParams()).rightMargin = gm.L((z5 || jb6.a0) ? 12.0f : 36.0f);
            if (z5) {
            }
            r6.setTranslationX(f);
        }
        this.E = user.id;
        dg0Var.k(m9c.r(user));
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null) {
            ?? r12 = userProfilePhoto.strippedBitmap;
            pc0Var = r12;
        }
        int i22 = this.b;
        this.c.m(gn5.m(i22, 1, user2), "50_50", pc0Var2, user2);
        bf0 bf0Var3 = this.f;
        if (!z) {
            if (bf0Var3 != null) {
                bf0Var3.setAnimatedEmojiDrawable(null);
            }
            Drawable mutate = getContext().getDrawable(R.drawable.media_like_active).mutate();
            bf0Var3.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
            bf0Var3.setImageDrawable(mutate);
            a0 = jb6.a0("AccDescrLike", null, 2131754850, new Object[0]);
            z5 = true;
        } else if (reaction != null) {
            k39 d = k39.d(reaction);
            if (d.f != null) {
                if (bf0Var3 != null) {
                    bf0Var3.setAnimatedEmojiDrawable(null);
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(i22).r.get(d.f);
                if (bf0Var3 != null) {
                    if (tL_availableReaction != null) {
                        bf0Var3.n(gn5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", eq3.d(tL_availableReaction.static_icon.thumbs, cmb.Z6, 1.0f, false), tL_availableReaction);
                        z6 = true;
                    } else {
                        bf0Var3.setImageDrawable(null);
                        z6 = false;
                    }
                    bf0Var3.setColorFilter(null);
                } else {
                    z6 = false;
                }
            } else {
                vm vmVar = new vm(0, i22, d.g);
                vmVar.setColorFilter(cmb.n0(ylbVar));
                if (bf0Var3 != null) {
                    bf0Var3.setAnimatedEmojiDrawable(vmVar);
                }
                z6 = true;
            }
            CharSequence text = dg0Var.getText();
            Object obj = d.f;
            if (obj == null) {
                obj = reaction;
            }
            z5 = z6;
            a0 = jb6.a0("AccDescrReactedWith", null, 2131754790, text, obj);
        } else {
            if (bf0Var3 != null) {
                bf0Var3.setAnimatedEmojiDrawable(null);
                bf0Var3.setImageDrawable(null);
            }
            a0 = jb6.a0("AccDescrPersonHasSeen", null, 2131754811, dg0Var.getText());
            z5 = false;
        }
        bf0 bf0Var22 = this.h;
        if (storyItem == null) {
            this.n = storyItem.id;
            if (bf0Var22 != null) {
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia != null) {
                    TLRPC.Photo photo = messageMedia.photo;
                    if (photo != null) {
                        str = null;
                        j2 = 0;
                        bf0Var22.h(gn5.i(bc4.w(photo.sizes, 35, false, null, true), storyItem.media.photo), "22_35", null, null, -1, storyItem);
                    } else {
                        str = null;
                        j2 = 0;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            bf0Var22.h(gn5.c(bc4.w(document.thumbs, 35, false, null, true), storyItem.media.document), "22_35", null, null, -1, storyItem);
                        }
                    }
                } else {
                    str = null;
                    j2 = 0;
                }
                bf0Var22.setRoundRadius(gm.L(3.33f));
            } else {
                str = null;
                j2 = 0;
            }
            if (j <= j2) {
                j3 = storyItem.date;
                if (j3 != j2) {
                    StringBuilder k = b10.k(a0, " ");
                    k.append(jb6.O(j3));
                    a0 = k.toString();
                }
                setContentDescription(a0);
                f = 0.0f;
                ?? r62 = this.e;
                if (j3 != j2) {
                    r62.setVisibility(0);
                    p57 p57Var = storyItem != null ? z2 ? L : K : z3 ? I : J;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(p57Var.a(getContext(), ylbVar));
                    spannableStringBuilder.append((CharSequence) jb6.O(j3));
                    if (z2 || storyItem == null) {
                        f2 = 9.0f;
                    } else {
                        f2 = 9.0f;
                        if (!TextUtils.isEmpty(storyItem.caption)) {
                            spannableStringBuilder.append((CharSequence) "\u2004");
                            spannableStringBuilder.append((CharSequence) ".");
                            gq3 gq3Var = new gq3();
                            gq3Var.c = 2.33333f;
                            gq3Var.b = gm.L(5.0f);
                            spannableStringBuilder.setSpan(gq3Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.append((CharSequence) "\u2004");
                            int length = spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) jb6.M0(2131744176, str));
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length, spannableStringBuilder.length(), 33);
                            r62.l(spannableStringBuilder, false);
                            r62.setTranslationY(z3 ? gm.L(-1.0f) : 0.0f);
                            dg0Var.setTranslationY(0.0f);
                            if (z4) {
                                dg0Var.setTranslationY(gm.L(f2));
                                dg0Var.animate().translationY(0.0f);
                                r62.setAlpha(0.0f);
                                r62.animate().alpha(1.0f);
                            }
                        }
                    }
                    if (!z2 && storyItem != null && (storyFwdHeader = storyItem.fwd_from) != null && storyFwdHeader.modified) {
                        spannableStringBuilder.append((CharSequence) "\u2004");
                        spannableStringBuilder.append((CharSequence) ".");
                        gq3 gq3Var2 = new gq3();
                        gq3Var2.c = 2.33333f;
                        gq3Var2.b = gm.L(5.0f);
                        spannableStringBuilder.setSpan(gq3Var2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) "\u2004");
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) "edited");
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length2, spannableStringBuilder.length(), 33);
                    }
                    r62.l(spannableStringBuilder, false);
                    r62.setTranslationY(z3 ? gm.L(-1.0f) : 0.0f);
                    dg0Var.setTranslationY(0.0f);
                    if (z4) {
                    }
                } else {
                    r62.setVisibility(8);
                    dg0Var.setTranslationY(gm.L(9.0f));
                }
                dg0Var.setRightPadding(gm.L(z5 ? 30.0f : 0.0f));
                dg0Var.setTranslationX((z5 || !jb6.a0) ? 0.0f : gm.L(30.0f));
                ((ViewGroup.MarginLayoutParams) r62.getLayoutParams()).rightMargin = gm.L((z5 || jb6.a0) ? 12.0f : 36.0f);
                if (z5 && jb6.a0) {
                    f = gm.L(30.0f);
                }
                r62.setTranslationX(f);
            }
        } else {
            str = null;
            j2 = 0;
            this.n = -1;
            if (bf0Var22 != null) {
                bf0Var22.setImageDrawable(null);
            }
        }
        j3 = j;
        if (j3 != j2) {
        }
        setContentDescription(a0);
        f = 0.0f;
        ?? r622 = this.e;
        if (j3 != j2) {
        }
        dg0Var.setRightPadding(gm.L(z5 ? 30.0f : 0.0f));
        dg0Var.setTranslationX((z5 || !jb6.a0) ? 0.0f : gm.L(30.0f));
        ((ViewGroup.MarginLayoutParams) r622.getLayoutParams()).rightMargin = gm.L((z5 || jb6.a0) ? 12.0f : 36.0f);
        if (z5) {
            f = gm.L(30.0f);
        }
        r622.setTranslationX(f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        if (this.G < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (this.G * 255.0f), 31);
            z = true;
        } else {
            z = false;
        }
        super.dispatchDraw(canvas);
        if (this.a) {
            float L2 = gm.L(this.y ? 73.0f : 55.0f);
            boolean z2 = jb6.a0;
            ylb ylbVar = this.x;
            if (z2) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L2, getMeasuredHeight() - 1, cmb.U0("paintDivider", ylbVar));
            } else {
                canvas.drawLine(L2, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, cmb.U0("paintDivider", ylbVar));
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.G;
    }

    public ylb getResourcesProvider() {
        return this.x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w.a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w.a.b();
        this.F.g();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(!this.y ? 50 : 58), TLObject.FLAG_30));
    }

    public void setUserReaction(TLRPC.MessagePeerReaction messagePeerReaction) {
        TLRPC.Chat L0;
        TLRPC.User user;
        if (messagePeerReaction == null) {
            return;
        }
        long B1 = k47.B1(messagePeerReaction.peer_id);
        int i = this.b;
        if (B1 > 0) {
            user = oc7.r1(i).W1(Long.valueOf(B1));
            L0 = null;
        } else {
            L0 = oc7.r1(i).L0(Long.valueOf(-B1));
            user = null;
        }
        c(user, L0, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    @Override // vlb
    public final void updateColors() {
        d0b d0bVar = this.w;
        if (d0bVar != null) {
            try {
                tm tmVar = d0bVar.a;
                if (!(tmVar != null) || tmVar.G == null) {
                    return;
                }
                tmVar.k(Integer.valueOf(cmb.v0(this.y ? cmb.F6 : cmb.y9, this.x)));
                dg0 dg0Var = this.d;
                if (dg0Var != null) {
                    dg0Var.invalidate();
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(long j) {
    }
}
