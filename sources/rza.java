// default package

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class rza extends FrameLayout implements tjb {
    public final TextView E;
    public final TextView F;
    public final ah8 G;
    public final ImageView H;
    public AnimatorSet I;
    public final byte a;
    public final px8 b;
    public final TextView c;
    public final be0 d;
    public final wf2 e;
    public boolean f;
    public final ImageView h;
    public final ImageView n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public final Rect w;
    public boolean x;
    public final FrameLayout y;

    /* JADX WARN: Multi-variable type inference failed */
    public rza(Context context, int i) {
        super(context);
        this.w = new Rect();
        this.a = i;
        be0 be0Var = new be0(context);
        this.d = be0Var;
        be0Var.setAspectFit(true);
        be0Var.setLayerNum(1);
        boolean z = k96.a0;
        addView(be0Var, nme.d(40, 40.0f, (z ? 5 : 3) | 48, z ? 0.0f : 13.0f, 9.0f, z ? 13.0f : 0.0f, 0.0f));
        if (i != 0) {
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            if (i != 3) {
                int i2 = bkb.Li;
                ff0 f0 = bkb.f0(bkb.w0(null, i2, false), 1, -1);
                vkb M = zkb.M(i2);
                imageView.setBackground(f0);
                zkb.j(imageView, f0, null, M, null);
            }
            if (i == 1) {
                int i3 = bkb.Ki;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                zkb.s(imageView, i3, null, mode);
                imageView.setImageResource(R.drawable.msg_actions);
                imageView.setContentDescription(k96.M0(2131754838, null));
                addView(imageView, nme.e(40, 40, (k96.a0 ? 3 : 5) | 16));
                ImageView imageView2 = new ImageView(context);
                this.n = imageView2;
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(R.drawable.list_reorder);
                zkb.s(imageView2, i3, null, mode);
                addView(imageView2, nme.h(58.0f, 58.0f, 8388613));
                wf2 wf2Var = new wf2(21, null, context);
                this.e = wf2Var;
                wf2Var.b(-1, bkb.c6, bkb.j7);
                wf2Var.setDrawUnchecked(false);
                wf2Var.setDrawBackgroundAsArc(3);
                addView(wf2Var, nme.i(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i == 3) {
                zkb.s(imageView, bkb.Ci, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(R.drawable.floating_check);
                boolean z2 = k96.a0;
                addView(imageView, nme.d(40, 40.0f, (z2 ? 3 : 5) | 48, z2 ? 10 : 0, 9.0f, z2 ? 0 : 10, 0.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.y = frameLayout;
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gl.o());
        textView.setText(k96.M0(2131754483, null));
        zkb.X(textView, bkb.Ii, null);
        int i4 = bkb.Ei;
        int w0 = bkb.w0(null, i4, false);
        int i5 = bkb.Gi;
        ff0 d = sjb.d(w0, bkb.w0(null, i5, false), 14.0f);
        vkb M2 = zkb.M(i4);
        vkb M3 = zkb.M(i5);
        textView.setBackground(d);
        zkb.j(textView, d, M2, M3, null);
        textView.setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
        textView.setGravity(17);
        byte b = 15;
        textView.setOnClickListener(new x00(this, b));
        frameLayout.addView(textView, nme.h(-2.0f, 28.0f, (k96.a0 ? 3 : 5) | 16));
        ote.a(textView);
        TextView textView2 = new TextView(context);
        this.F = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gl.o());
        textView2.setText(k96.M0(2131744618, null));
        zkb.X(textView2, bkb.Hi, null);
        ff0 d2 = sjb.d(0, bkb.w0(null, i4, false) & 452984831, 14.0f);
        vkb g = zkb.g(i4, 26);
        textView2.setBackground(d2);
        zkb.j(textView2, d2, null, g, null);
        textView2.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new x00(this, b));
        frameLayout.addView(textView2, nme.i(-2.0f, 32.0f, (k96.a0 ? 3 : 5) | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        ote.a(textView2);
        ah8 ah8Var = new ah8(gl.L(4.0f), null, context, false);
        this.G = ah8Var;
        ah8Var.setIcon(R.raw.unlock_icon);
        ah8Var.b(k96.M0(2131743637, null), new x00(this, b), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ah8Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = gl.L(1.0f);
            marginLayoutParams.topMargin = gl.L(1.0f);
            int L = gl.L(20.0f);
            marginLayoutParams.height = L;
            marginLayoutParams.width = L;
            ((ViewGroup.MarginLayoutParams) ah8Var.getTextView().getLayoutParams()).leftMargin = gl.L(3.0f);
            ah8Var.getChildAt(0).setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        } catch (Exception unused) {
        }
        this.y.addView(this.G, nme.h(-2.0f, 28.0f, (k96.a0 ? 3 : 5) | 16));
        ote.a(this.G);
        this.y.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
        addView(this.y, nme.d(-2, -1.0f, k96.a0 ? 3 : 5, 0.0f, 0.0f, 0.0f, 0.0f));
        this.y.setOnClickListener(new bna(this, (byte) 10));
        px8 px8Var = new px8(context, (byte) 4);
        this.b = px8Var;
        kk7.i(px8Var);
        zkb.X(px8Var, bkb.F6, null);
        px8Var.setTextSize(1, 16.0f);
        px8Var.setTypeface(gl.o());
        px8Var.setLines(1);
        px8Var.setMaxLines(1);
        px8Var.setSingleLine(true);
        px8Var.setEllipsize(TextUtils.TruncateAt.END);
        px8Var.setGravity(nme.y());
        addView(px8Var, nme.i(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        zkb.X(textView3, bkb.y6, null);
        ug8.w(textView3, 1, 13.0f, 1, 1);
        textView3.setSingleLine(true);
        textView3.setGravity(nme.y());
        addView(textView3, nme.i(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
        if (i == 3) {
            ImageView imageView3 = new ImageView(context);
            this.H = imageView3;
            imageView3.setImageResource(R.drawable.msg_close);
            imageView3.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
            zkb.s(imageView3, bkb.x6, null, PorterDuff.Mode.SRC_IN);
            int i6 = bkb.h6;
            ff0 f02 = bkb.f0(bkb.w0(null, i6, false), 1, -1);
            vkb M4 = zkb.M(i6);
            imageView3.setBackground(f02);
            zkb.j(imageView3, f02, null, M4, null);
            imageView3.setVisibility(8);
            boolean z3 = k96.a0;
            addView(imageView3, nme.d(-2, -2.0f, (z3 ? 3 : 5) | 16, z3 ? 4.0f : 0.0f, 0.0f, z3 ? 0.0f : 4.0f, 0.0f));
        }
        e(0);
    }

    public final boolean a() {
        byte b = this.a;
        if (b == 1) {
            return this.e.a.q;
        }
        if (b == 3) {
            if (this.h.getVisibility() != 0) {
                return false;
            }
        } else if (!this.x || this.y.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.l6));
    }

    public final void b(boolean z, boolean z2) {
        byte b = this.a;
        if (b == 1) {
            this.e.a(z, z2);
            return;
        }
        if (b == 3) {
            ImageView imageView = this.h;
            if (z2) {
                imageView.animate().cancel();
                imageView.animate().setListener(new pza(this, z, (byte) 0)).alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.1f).scaleY(z ? 1.0f : 0.1f).setDuration(150L).start();
                return;
            }
            imageView.setVisibility(z ? 0 : 4);
            if (z) {
                imageView.setAlpha(1.0f);
                imageView.setScaleX(1.0f);
                imageView.setScaleY(1.0f);
                return;
            } else {
                imageView.setAlpha(0.0f);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                return;
            }
        }
        if (this.x) {
            FrameLayout frameLayout = this.y;
            if (z2) {
                frameLayout.animate().cancel();
                frameLayout.animate().setListener(new pza(this, z, (byte) 1)).alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.1f).scaleY(z ? 1.0f : 0.1f).setDuration(150L).start();
                return;
            }
            frameLayout.setVisibility(z ? 0 : 4);
            if (z) {
                frameLayout.setAlpha(1.0f);
                frameLayout.setScaleX(1.0f);
                frameLayout.setScaleY(1.0f);
            } else {
                frameLayout.setAlpha(0.0f);
                frameLayout.setScaleX(0.1f);
                frameLayout.setScaleY(0.1f);
            }
        }
    }

    public final void c(final boolean z) {
        float f;
        final byte b = 1;
        if (this.a == 1) {
            float f2 = 0.0f;
            float f3 = 1.0f;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
                f2 = 1.0f;
            }
            final byte b2 = 2;
            final byte b3 = 0;
            float[] fArr = {f, f2};
            float f4 = 0.66f;
            if (z) {
                f3 = 0.66f;
                f4 = 1.0f;
            }
            float[] fArr2 = {f4, f3};
            ImageView imageView = this.n;
            imageView.setVisibility(0);
            ViewPropertyAnimator duration = imageView.animate().alpha(fArr[0]).scaleX(fArr2[0]).scaleY(fArr2[0]).setDuration(200L);
            s33 s33Var = ls3.a;
            duration.setInterpolator(s33Var).withEndAction(new Runnable(this) { // from class: oza
                public final /* synthetic */ rza b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b4 = b3;
                    boolean z2 = z;
                    rza rzaVar = this.b;
                    switch (b4) {
                        case 0:
                            if (!z2) {
                                rzaVar.n.setVisibility(8);
                                break;
                            }
                            break;
                        case 1:
                            if (z2) {
                                rzaVar.y.setVisibility(8);
                                break;
                            }
                            break;
                        default:
                            if (z2) {
                                rzaVar.h.setVisibility(8);
                                break;
                            }
                            break;
                    }
                }
            }).start();
            if (this.x) {
                FrameLayout frameLayout = this.y;
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(s33Var).withEndAction(new Runnable(this) { // from class: oza
                    public final /* synthetic */ rza b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b;
                        boolean z2 = z;
                        rza rzaVar = this.b;
                        switch (b4) {
                            case 0:
                                if (!z2) {
                                    rzaVar.n.setVisibility(8);
                                    break;
                                }
                                break;
                            case 1:
                                if (z2) {
                                    rzaVar.y.setVisibility(8);
                                    break;
                                }
                                break;
                            default:
                                if (z2) {
                                    rzaVar.h.setVisibility(8);
                                    break;
                                }
                                break;
                        }
                    }
                }).start();
            } else {
                ImageView imageView2 = this.h;
                imageView2.setVisibility(0);
                imageView2.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(s33Var).withEndAction(new Runnable(this) { // from class: oza
                    public final /* synthetic */ rza b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b2;
                        boolean z2 = z;
                        rza rzaVar = this.b;
                        switch (b4) {
                            case 0:
                                if (!z2) {
                                    rzaVar.n.setVisibility(8);
                                    break;
                                }
                                break;
                            case 1:
                                if (z2) {
                                    rzaVar.y.setVisibility(8);
                                    break;
                                }
                                break;
                            default:
                                if (z2) {
                                    rzaVar.h.setVisibility(8);
                                    break;
                                }
                                break;
                        }
                    }
                }).start();
            }
        }
    }

    public final void d(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z, boolean z2) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        TLRPC.Document document;
        this.f = z;
        this.r = tL_messages_stickerSet;
        this.s = z2;
        be0 be0Var = this.d;
        be0Var.setVisibility(0);
        px8 px8Var = this.b;
        px8Var.setTranslationY(0.0f);
        px8Var.setText(this.r.set.title);
        boolean z3 = this.r.set.archived;
        TextView textView = this.c;
        if (z3) {
            px8Var.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            be0Var.setAlpha(0.5f);
        } else {
            px8Var.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            be0Var.setAlpha(1.0f);
        }
        boolean z4 = tL_messages_stickerSet.set.emojis;
        this.x = z4;
        this.y.setVisibility(z4 ? 0 : 8);
        this.h.setVisibility(this.x ? 8 : 0);
        be0Var.setColorFilter(null);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        if (arrayList == null || arrayList.isEmpty()) {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
            textView.setText(k96.G(0, tL_messages_stickerSet2.set.emojis ? "EmojiCount" : "Stickers", new Object[0]));
            be0Var.setImageDrawable(null);
            if (tL_messages_stickerSet2.set.thumb_document_id != 0) {
                vl.g(y6c.t0).b(tL_messages_stickerSet2.set.thumb_document_id, new a27(this, (byte) 2));
            }
        } else {
            textView.setText(k96.G(arrayList.size(), this.x ? "EmojiCount" : "Stickers", new Object[0]));
            int i = 0;
            while (true) {
                if (i >= arrayList.size()) {
                    document = null;
                    break;
                }
                document = arrayList.get(i);
                if (document != null && document.id == tL_messages_stickerSet.set.thumb_document_id) {
                    break;
                } else {
                    i++;
                }
            }
            if (document == null) {
                document = arrayList.get(0);
            }
            TLRPC.Document document2 = document;
            e66.e(1);
            TLObject w = ba4.w(tL_messages_stickerSet.set.thumbs, 90, false, null, false);
            if (w == null) {
                w = document2;
            }
            kcb d = uo3.d(tL_messages_stickerSet.set.thumbs, bkb.Z6, 1.0f, false);
            boolean z5 = w instanceof TLRPC.Document;
            gl5 c = z5 ? gl5.c(ba4.w(document2.thumbs, 90, false, null, false), document2) : gl5.k((TLRPC.PhotoSize) w, document2, tL_messages_stickerSet.set.thumb_version);
            String concat = "50_50".concat(!e66.e(this.x ? 16388 : 1) ? "_firstframe" : "");
            if (z5 && (k27.K2(document2, true) || k27.M4(document2))) {
                if (d != null) {
                    be0Var.p(gl5.b(document2), concat, d, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                } else {
                    be0Var.h(gl5.b(document2), concat, c, null, 0, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                }
                if (k27.B4(document2)) {
                    be0Var.setColorFilter(bkb.u3);
                }
            } else {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                if (c == null || c.p != 1) {
                    be0Var.n(c, concat, "webp", d, tL_messages_stickerSet2);
                } else {
                    be0Var.n(c, concat, "tgs", d, tL_messages_stickerSet2);
                }
            }
        }
        if (this.s) {
            textView.setText((tL_messages_stickerSet2.set.emojis ? "t.me/addemoji/" : "t.me/addstickers/") + tL_messages_stickerSet2.set.short_name);
        }
    }

    public final void e(int i) {
        AnimatorSet animatorSet = this.I;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.I = null;
        }
        byte b = 15;
        ah8 ah8Var = this.G;
        if (i == 1) {
            ah8Var.b(k96.M0(2131743637, null), new x00(this, b), false);
        } else if (i == 2) {
            ah8Var.b(k96.M0(2131745889, null), new x00(this, b), false);
        }
        ah8Var.setEnabled(i == 1 || i == 2);
        boolean z = i == 3;
        TextView textView = this.E;
        textView.setEnabled(z);
        boolean z2 = i == 4;
        TextView textView2 = this.F;
        textView2.setEnabled(z2);
        ah8Var.setAlpha((i == 1 || i == 2) ? 1.0f : 0.0f);
        ah8Var.setScaleX((i == 1 || i == 2) ? 1.0f : 0.6f);
        ah8Var.setScaleY((i == 1 || i == 2) ? 1.0f : 0.6f);
        ah8Var.setVisibility((i == 1 || i == 2) ? 0 : 8);
        textView.setAlpha(i == 3 ? 1.0f : 0.0f);
        textView.setScaleX(i == 3 ? 1.0f : 0.6f);
        textView.setScaleY(i == 3 ? 1.0f : 0.6f);
        textView.setVisibility(i == 3 ? 0 : 8);
        textView2.setAlpha(i == 4 ? 1.0f : 0.0f);
        textView2.setScaleX(i == 4 ? 1.0f : 0.6f);
        textView2.setScaleY(i != 4 ? 0.6f : 1.0f);
        textView2.setVisibility(i != 4 ? 8 : 0);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gl.L(58.0f), TLObject.FLAG_30);
        FrameLayout frameLayout = this.y;
        frameLayout.measure(-2146483649, makeMeasureSpec);
        int measuredWidth = frameLayout.getMeasuredWidth() + gl.L(26.0f);
        boolean z3 = k96.a0;
        TextView textView3 = this.c;
        px8 px8Var = this.b;
        if (z3) {
            ((ViewGroup.MarginLayoutParams) px8Var.getLayoutParams()).leftMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).leftMargin = measuredWidth;
        } else {
            ((ViewGroup.MarginLayoutParams) px8Var.getLayoutParams()).rightMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).rightMargin = measuredWidth;
        }
    }

    public TLRPC.TL_messages_stickerSet getStickersSet() {
        return this.r;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f) {
            canvas.drawLine(k96.a0 ? 0.0f : gl.L(71.0f), getHeight() - 1, (getWidth() - getPaddingRight()) - (k96.a0 ? gl.L(71.0f) : 0), getHeight() - 1, bkb.j0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        wf2 wf2Var = this.e;
        if (wf2Var == null || !wf2Var.a.q) {
            return;
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(58.0f) + (this.f ? 1 : 0), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout;
        ImageView imageView;
        Drawable background = getBackground();
        Rect rect = this.w;
        if (background != null && (imageView = this.h) != null) {
            imageView.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        if (getBackground() != null && this.x && (frameLayout = this.y) != null) {
            frameLayout.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setChecked(boolean z) {
        b(z, true);
    }

    public void setDeleteAction(View.OnClickListener onClickListener) {
        ImageView imageView = this.H;
        if (imageView != null) {
            imageView.setVisibility(onClickListener == null ? 8 : 0);
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z) {
        this.f = z;
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.n.setOnTouchListener(onTouchListener);
    }

    public void setReorderable(boolean z) {
        c(z);
    }

    @Override // tjb
    public final void updateColors() {
    }
}
