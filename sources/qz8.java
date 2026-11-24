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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class qz8 extends FrameLayout implements tjb {
    public static final p37 I;
    public static final p37 J;
    public static final p37 K;
    public static final p37 L;
    public long E;
    public final j72 F;
    public float G;
    public ValueAnimator H;
    public boolean a;
    public final int b;
    public final pz8 c;
    public final df0 d;
    public final jia e;
    public final be0 f;
    public final be0 h;
    public int n;
    public final pb0 r;
    public final View s;
    public final aya w;
    public final wjb x;
    public final boolean y;

    static {
        int i = bkb.x6;
        I = new p37(R.drawable.msg_mini_checks, i);
        p37 p37Var = new p37(R.drawable.msg_reactions, i);
        p37Var.g = 16;
        p37Var.h = 16;
        p37Var.i = 5.66f;
        J = p37Var;
        int i2 = bkb.Xk;
        K = new p37(R.drawable.mini_repost_story, i2);
        L = new p37(R.drawable.mini_forward_story, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qz8(int i, int i2, wjb wjbVar, Context context, boolean z, boolean z2) {
        super(context);
        float f;
        float f2;
        this.r = new pb0((wjb) null);
        this.G = 1.0f;
        this.y = i;
        this.b = i2;
        this.x = wjbVar;
        this.F = new j72(this, wjbVar);
        setLayoutParams(new e49(-1, gl.L(50.0f)));
        int i3 = i == 1 ? 48 : 34;
        pz8 pz8Var = new pz8(this, context, i);
        this.c = pz8Var;
        float f3 = i3;
        pz8Var.setRoundRadius(gl.L(f3));
        addView(pz8Var, nme.i(f3, f3, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i == 1) {
            setClipChildren(false);
        }
        df0 df0Var = new df0(context, (byte) 4);
        this.d = df0Var;
        kk7.i(df0Var);
        df0Var.setTextSize(16);
        zkb.W(df0Var, bkb.D8, wjbVar);
        df0Var.setEllipsizeByGradient(true);
        df0Var.setImportantForAccessibility(2);
        df0Var.setRightPadding(gl.L(30.0f));
        df0Var.setTranslationX(k96.a0 ? gl.L(30.0f) : 0.0f);
        df0Var.setRightDrawableOutside(true);
        if (i == 1) {
            f = 7.66f;
            f2 = 73.0f;
        } else {
            f = 5.33f;
            f2 = 55.0f;
        }
        float f4 = f2;
        addView(df0Var, nme.i(-1.0f, -2.0f, 55, f4, f, 12.0f, 0.0f));
        aya ayaVar = new aya(this);
        this.w = ayaVar;
        df0Var.setDrawablePadding(gl.L(3.0f));
        df0Var.i(ayaVar.a);
        jia jiaVar = new jia(context);
        this.e = jiaVar;
        jiaVar.setTextSize(13);
        zkb.W(jiaVar, bkb.x6, wjbVar);
        jiaVar.setEllipsizeByGradient(true);
        jiaVar.setImportantForAccessibility(2);
        jiaVar.setTranslationX(k96.a0 ? gl.L(30.0f) : 0.0f);
        addView(jiaVar, nme.i(-1.0f, -2.0f, 55, f4, i == 1 ? 24.0f : 19.0f, 20.0f, 0.0f));
        if (z2) {
            be0 be0Var = new be0(context);
            this.f = be0Var;
            addView(be0Var, nme.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            be0 be0Var2 = new be0(context);
            this.h = be0Var2;
            addView(be0Var2, nme.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z) {
            View view = new View(context);
            this.s = view;
            view.setBackground(bkb.L0(false));
            addView(view, nme.c(-1.0f, -1));
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
        ofFloat.addUpdateListener(new u28(this, (byte) 23));
        this.H.addListener(new t7(this, f, (byte) 6));
        this.H.setInterpolator(s33.h);
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
    /* JADX WARN: Type inference failed for: r19v0, types: [android.view.View, qz8] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.graphics.drawable.BitmapDrawable] */
    /* JADX WARN: Type inference failed for: r1v47, types: [android.graphics.drawable.BitmapDrawable] */
    /* JADX WARN: Type inference failed for: r21v0, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, jia] */
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
        pb0 pb0Var;
        TLRPC.User user2 = user == null ? chat : user;
        if (user2 == null) {
            return;
        }
        int i = this.y ? bkb.F6 : bkb.y9;
        wjb wjbVar = this.x;
        this.w.b(user, chat, bkb.v0(i, wjbVar), false);
        pb0 pb0Var2 = this.r;
        pb0Var2.o(user2);
        df0 df0Var = this.d;
        if (user == null) {
            this.E = -chat.id;
            df0Var.k(chat.title);
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            if (chatPhoto != null) {
                ?? r1 = chatPhoto.strippedBitmap;
                pb0Var = r1;
            }
            int i2 = this.b;
            this.c.m(gl5.m(i2, 1, user2), "50_50", pb0Var2, user2);
            be0 be0Var = this.f;
            if (!z) {
            }
            be0 be0Var2 = this.h;
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
            df0Var.setRightPadding(gl.L(z5 ? 30.0f : 0.0f));
            df0Var.setTranslationX((z5 || !k96.a0) ? 0.0f : gl.L(30.0f));
            ((ViewGroup.MarginLayoutParams) r6.getLayoutParams()).rightMargin = gl.L((z5 || k96.a0) ? 12.0f : 36.0f);
            if (z5) {
            }
            r6.setTranslationX(f);
        }
        this.E = user.id;
        df0Var.k(l7c.r(user));
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null) {
            ?? r12 = userProfilePhoto.strippedBitmap;
            pb0Var = r12;
        }
        int i22 = this.b;
        this.c.m(gl5.m(i22, 1, user2), "50_50", pb0Var2, user2);
        be0 be0Var3 = this.f;
        if (!z) {
            if (be0Var3 != null) {
                be0Var3.setAnimatedEmojiDrawable(null);
            }
            Drawable mutate = getContext().getDrawable(R.drawable.media_like_active).mutate();
            be0Var3.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
            be0Var3.setImageDrawable(mutate);
            a0 = k96.a0("AccDescrLike", null, 2131754850, new Object[0]);
            z5 = true;
        } else if (reaction != null) {
            h19 d = h19.d(reaction);
            if (d.f != null) {
                if (be0Var3 != null) {
                    be0Var3.setAnimatedEmojiDrawable(null);
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(i22).r.get(d.f);
                if (be0Var3 != null) {
                    if (tL_availableReaction != null) {
                        be0Var3.n(gl5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", uo3.d(tL_availableReaction.static_icon.thumbs, bkb.Z6, 1.0f, false), tL_availableReaction);
                        z6 = true;
                    } else {
                        be0Var3.setImageDrawable(null);
                        z6 = false;
                    }
                    be0Var3.setColorFilter(null);
                } else {
                    z6 = false;
                }
            } else {
                vl vlVar = new vl(0, i22, d.g);
                vlVar.setColorFilter(bkb.n0(wjbVar));
                if (be0Var3 != null) {
                    be0Var3.setAnimatedEmojiDrawable(vlVar);
                }
                z6 = true;
            }
            CharSequence text = df0Var.getText();
            Object obj = d.f;
            if (obj == null) {
                obj = reaction;
            }
            z5 = z6;
            a0 = k96.a0("AccDescrReactedWith", null, 2131754790, text, obj);
        } else {
            if (be0Var3 != null) {
                be0Var3.setAnimatedEmojiDrawable(null);
                be0Var3.setImageDrawable(null);
            }
            a0 = k96.a0("AccDescrPersonHasSeen", null, 2131754811, df0Var.getText());
            z5 = false;
        }
        be0 be0Var22 = this.h;
        if (storyItem == null) {
            this.n = storyItem.id;
            if (be0Var22 != null) {
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia != null) {
                    TLRPC.Photo photo = messageMedia.photo;
                    if (photo != null) {
                        str = null;
                        j2 = 0;
                        be0Var22.h(gl5.i(ba4.w(photo.sizes, 35, false, null, true), storyItem.media.photo), "22_35", null, null, -1, storyItem);
                    } else {
                        str = null;
                        j2 = 0;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            be0Var22.h(gl5.c(ba4.w(document.thumbs, 35, false, null, true), storyItem.media.document), "22_35", null, null, -1, storyItem);
                        }
                    }
                } else {
                    str = null;
                    j2 = 0;
                }
                be0Var22.setRoundRadius(gl.L(3.33f));
            } else {
                str = null;
                j2 = 0;
            }
            if (j <= j2) {
                j3 = storyItem.date;
                if (j3 != j2) {
                    StringBuilder k = b00.k(a0, " ");
                    k.append(k96.O(j3));
                    a0 = k.toString();
                }
                setContentDescription(a0);
                f = 0.0f;
                ?? r62 = this.e;
                if (j3 != j2) {
                    r62.setVisibility(0);
                    p37 p37Var = storyItem != null ? z2 ? L : K : z3 ? I : J;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(p37Var.a(getContext(), wjbVar));
                    spannableStringBuilder.append((CharSequence) k96.O(j3));
                    if (z2 || storyItem == null) {
                        f2 = 9.0f;
                    } else {
                        f2 = 9.0f;
                        if (!TextUtils.isEmpty(storyItem.caption)) {
                            spannableStringBuilder.append((CharSequence) "\u2004");
                            spannableStringBuilder.append((CharSequence) ".");
                            wo3 wo3Var = new wo3();
                            wo3Var.c = 2.33333f;
                            wo3Var.b = gl.L(5.0f);
                            spannableStringBuilder.setSpan(wo3Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.append((CharSequence) "\u2004");
                            int length = spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) k96.M0(2131744250, str));
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length, spannableStringBuilder.length(), 33);
                            r62.l(spannableStringBuilder, false);
                            r62.setTranslationY(z3 ? gl.L(-1.0f) : 0.0f);
                            df0Var.setTranslationY(0.0f);
                            if (z4) {
                                df0Var.setTranslationY(gl.L(f2));
                                df0Var.animate().translationY(0.0f);
                                r62.setAlpha(0.0f);
                                r62.animate().alpha(1.0f);
                            }
                        }
                    }
                    if (!z2 && storyItem != null && (storyFwdHeader = storyItem.fwd_from) != null && storyFwdHeader.modified) {
                        spannableStringBuilder.append((CharSequence) "\u2004");
                        spannableStringBuilder.append((CharSequence) ".");
                        wo3 wo3Var2 = new wo3();
                        wo3Var2.c = 2.33333f;
                        wo3Var2.b = gl.L(5.0f);
                        spannableStringBuilder.setSpan(wo3Var2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) "\u2004");
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) "edited");
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length2, spannableStringBuilder.length(), 33);
                    }
                    r62.l(spannableStringBuilder, false);
                    r62.setTranslationY(z3 ? gl.L(-1.0f) : 0.0f);
                    df0Var.setTranslationY(0.0f);
                    if (z4) {
                    }
                } else {
                    r62.setVisibility(8);
                    df0Var.setTranslationY(gl.L(9.0f));
                }
                df0Var.setRightPadding(gl.L(z5 ? 30.0f : 0.0f));
                df0Var.setTranslationX((z5 || !k96.a0) ? 0.0f : gl.L(30.0f));
                ((ViewGroup.MarginLayoutParams) r62.getLayoutParams()).rightMargin = gl.L((z5 || k96.a0) ? 12.0f : 36.0f);
                if (z5 && k96.a0) {
                    f = gl.L(30.0f);
                }
                r62.setTranslationX(f);
            }
        } else {
            str = null;
            j2 = 0;
            this.n = -1;
            if (be0Var22 != null) {
                be0Var22.setImageDrawable(null);
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
        df0Var.setRightPadding(gl.L(z5 ? 30.0f : 0.0f));
        df0Var.setTranslationX((z5 || !k96.a0) ? 0.0f : gl.L(30.0f));
        ((ViewGroup.MarginLayoutParams) r622.getLayoutParams()).rightMargin = gl.L((z5 || k96.a0) ? 12.0f : 36.0f);
        if (z5) {
            f = gl.L(30.0f);
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
            float L2 = gl.L(this.y ? 73.0f : 55.0f);
            boolean z2 = k96.a0;
            wjb wjbVar = this.x;
            if (z2) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L2, getMeasuredHeight() - 1, bkb.U0("paintDivider", wjbVar));
            } else {
                canvas.drawLine(L2, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, bkb.U0("paintDivider", wjbVar));
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.G;
    }

    public wjb getResourcesProvider() {
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
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(!this.y ? 50 : 58), TLObject.FLAG_30));
    }

    public void setUserReaction(TLRPC.MessagePeerReaction messagePeerReaction) {
        TLRPC.Chat K0;
        TLRPC.User user;
        if (messagePeerReaction == null) {
            return;
        }
        long B1 = k27.B1(messagePeerReaction.peer_id);
        int i = this.b;
        if (B1 > 0) {
            user = na7.q1(i).V1(Long.valueOf(B1));
            K0 = null;
        } else {
            K0 = na7.q1(i).K0(Long.valueOf(-B1));
            user = null;
        }
        c(user, K0, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    @Override // tjb
    public final void updateColors() {
        aya ayaVar = this.w;
        if (ayaVar != null) {
            try {
                tl tlVar = ayaVar.a;
                if (!(tlVar != null) || tlVar.G == null) {
                    return;
                }
                tlVar.k(Integer.valueOf(bkb.v0(this.y ? bkb.F6 : bkb.y9, this.x)));
                df0 df0Var = this.d;
                if (df0Var != null) {
                    df0Var.invalidate();
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(long j) {
    }
}
