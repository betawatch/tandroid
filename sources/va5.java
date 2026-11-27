// default package

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class va5 extends LinearLayout implements VoIPService.StateListener, fn7 {
    public boolean E;
    public float F;
    public float G;
    public TextView a;
    public TextView b;
    public kmc c;
    public kmc d;
    public de0 e;
    public RectF f;
    public Paint h;
    public LinearGradient n;
    public byte r;
    public float s;
    public float w;
    public boolean x;
    public int y;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(float f, float f2, int i) {
        this.r = i;
        this.s = f;
        this.w = f2;
        invalidate();
        this.x = true;
    }

    public final void b(boolean z) {
        VoIPService sharedInstance;
        boolean z2;
        kmc kmcVar = this.d;
        kmc kmcVar2 = this.c;
        if (kmcVar2 == null || kmcVar == null || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        boolean isBluetoothOn = sharedInstance.isBluetoothOn();
        boolean z3 = !isBluetoothOn && sharedInstance.isSpeakerphoneOn();
        kmcVar2.b(z3, z);
        if (isBluetoothOn) {
            z2 = z;
            kmcVar2.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, ob6.M0(2131743155, null), false, z2);
        } else {
            z2 = z;
            if (z3) {
                kmcVar2.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, ob6.M0(2131742891, null), false, z2);
            } else if (sharedInstance.isHeadsetPlugged()) {
                kmcVar2.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, ob6.M0(2131743153, null), false, z2);
            } else {
                kmcVar2.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, ob6.M0(2131742891, null), false, z2);
            }
        }
        if (sharedInstance.mutedByAdmin()) {
            kmcVar.c(R.drawable.calls_unmute, -1, vm2.o(-1, 76), 0.1f, true, ob6.M0(2131742943, null), true, z2);
        } else {
            kmcVar.c(R.drawable.calls_unmute, -1, vm2.o(-1, (int) ((sharedInstance.isMicMute() ? 0.3f : 0.15f) * 255.0f)), 0.1f, true, ob6.M0(sharedInstance.isMicMute() ? 2131742882 : 2131742945, null), sharedInstance.isMicMute(), z2);
        }
        invalidate();
    }

    public final void c() {
        TextView textView = this.b;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.groupCall == null) {
            return;
        }
        int callState = sharedInstance.getCallState();
        if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
            textView.setText(ob6.M0(2131743044, "VoipGroupConnecting"));
        } else {
            TLRPC.GroupCall groupCall = sharedInstance.groupCall.b;
            textView.setText(ob6.G(groupCall.participants_count, groupCall.rtmp_stream ? "ViewersWatching" : "Participants", new Object[0]));
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        boolean mutedByAdmin;
        if (i == jn7.w2) {
            c();
            if (VoIPService.getSharedInstance() == null || (mutedByAdmin = VoIPService.getSharedInstance().mutedByAdmin()) == this.E) {
                return;
            }
            this.E = mutedByAdmin;
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String str;
        vc2 vc2Var;
        int i = this.y;
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            rb0 rb0Var = new rb0((vnb) null);
            TLRPC.Chat chat = sharedInstance.getChat();
            rb0Var.h(aob.w0(null, aob.p8[rb0.d(chat != null ? chat.id : 0L)], false), aob.w0(null, aob.q8[rb0.d(chat != null ? chat.id : 0L)], false));
            rb0Var.p(chat);
            if (chat != null) {
                this.e.m(jn5.e(chat.photo.photo_small), "50_50", rb0Var, null);
            }
            if (!sharedInstance.isConference() || (vc2Var = sharedInstance.groupCall) == null) {
                str = !TextUtils.isEmpty(sharedInstance.groupCall.b.title) ? sharedInstance.groupCall.b.title : chat != null ? chat.title : "";
            } else if (vc2Var.e.size() == 1) {
                str = ob6.M0(2131751788, null);
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < Math.min(3, sharedInstance.groupCall.e.size()); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(wf3.s(wf3.n(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.e.get(i2)).peer)));
                }
                if (sharedInstance.groupCall.e.size() > 3) {
                    sb.append(" ");
                    sb.append(ob6.G(sharedInstance.groupCall.e.size() - 3, "AndOther", new Object[0]));
                }
                str = sb.toString();
            }
            if (str != null) {
                str = str.replace("\n", " ").replaceAll(" +", " ").trim();
            }
            this.a.setText(str);
            c();
            sharedInstance.registerStateListener(this);
            if (VoIPService.getSharedInstance() != null) {
                this.E = VoIPService.getSharedInstance().mutedByAdmin();
            }
            this.G = this.E ? 1.0f : 0.0f;
            this.F = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.E) ? 1.0f : 0.0f;
        }
        jn7.f(i).b(this, jn7.w2);
        b(false);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        jn7.f(this.y).n(this, jn7.w2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        float translationX;
        float measuredHeight;
        Paint paint = this.h;
        RectF rectF = this.f;
        boolean z = VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.E;
        float f = this.F;
        if (z) {
            if (f != 1.0f) {
                float f2 = f + 0.10666667f;
                this.F = f2;
                if (f2 >= 1.0f) {
                    this.F = 1.0f;
                }
                this.x = true;
                invalidate();
            }
        } else if (f != 0.0f) {
            float f3 = f - 0.10666667f;
            this.F = f3;
            if (f3 < 0.0f) {
                this.F = 0.0f;
            }
            this.x = true;
            invalidate();
        }
        boolean z2 = this.E;
        float f4 = this.G;
        if (z2) {
            if (f4 != 1.0f) {
                float f5 = f4 + 0.10666667f;
                this.G = f5;
                if (f5 >= 1.0f) {
                    this.G = 1.0f;
                }
                this.x = true;
                invalidate();
            }
        } else if (f4 != 0.0f) {
            float f6 = f4 - 0.10666667f;
            this.G = f6;
            if (f6 < 0.0f) {
                this.G = 0.0f;
            }
            this.x = true;
            invalidate();
        }
        if (this.x) {
            int f7 = vm2.f(1.0f - this.F, aob.w0(null, aob.Th, false), aob.w0(null, aob.Vh, false));
            int f8 = vm2.f(1.0f - this.F, aob.w0(null, aob.Uh, false), aob.w0(null, aob.Wh, false));
            int f9 = vm2.f(this.G, f7, aob.w0(null, aob.Xh, false));
            int f10 = vm2.f(this.G, f8, aob.w0(null, aob.Yh, false));
            this.x = false;
            byte b = this.r;
            if (b == 0) {
                this.n = new LinearGradient(-hl.L(60.0f), this.w - getTranslationY(), getMeasuredWidth(), getMeasuredHeight() / 2.0f, new int[]{f9, f10}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (b == 1) {
                this.n = new LinearGradient(0.0f, getMeasuredHeight() / 2.0f, hl.L(60.0f) + getMeasuredWidth(), this.w - getTranslationY(), new int[]{f10, f9}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (b == 2) {
                this.n = new LinearGradient(this.s - getTranslationX(), -hl.L(60.0f), getMeasuredWidth() / 2.0f, getMeasuredHeight(), new int[]{f9, f10}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                this.n = new LinearGradient(getMeasuredWidth() / 2.0f, 0.0f, this.s - getTranslationX(), hl.L(60.0f) + getMeasuredHeight(), new int[]{f10, f9}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        paint.setShader(this.n);
        canvas.drawRoundRect(rectF, hl.L(10.0f), hl.L(10.0f), paint);
        byte b2 = this.r;
        if (b2 == 0) {
            measuredHeight = this.w - getTranslationY();
            translationX = 0.0f;
        } else if (b2 == 1) {
            measuredHeight = this.w - getTranslationY();
            translationX = getMeasuredWidth();
        } else {
            float f11 = this.s;
            if (b2 == 2) {
                translationX = f11 - getTranslationX();
                measuredHeight = 0.0f;
            } else {
                translationX = f11 - getTranslationX();
                measuredHeight = getMeasuredHeight();
            }
        }
        setPivotX(translationX);
        setPivotY(measuredHeight);
        canvas.save();
        byte b3 = this.r;
        if (b3 == 0) {
            canvas.clipRect(translationX - hl.L(15.0f), measuredHeight - hl.L(15.0f), translationX, hl.L(15.0f) + measuredHeight);
            canvas.translate(hl.L(3.0f), 0.0f);
            canvas.rotate(45.0f, translationX, measuredHeight);
        } else if (b3 == 1) {
            canvas.clipRect(translationX, measuredHeight - hl.L(15.0f), hl.L(15.0f) + translationX, hl.L(15.0f) + measuredHeight);
            canvas.translate(-hl.L(3.0f), 0.0f);
            canvas.rotate(45.0f, translationX, measuredHeight);
        } else if (b3 == 2) {
            canvas.clipRect(translationX - hl.L(15.0f), measuredHeight - hl.L(15.0f), hl.L(15.0f) + translationX, measuredHeight);
            canvas.rotate(45.0f, translationX, measuredHeight);
            canvas.translate(0.0f, hl.L(3.0f));
        } else {
            canvas.clipRect(translationX - hl.L(15.0f), measuredHeight, hl.L(15.0f) + translationX, hl.L(15.0f) + measuredHeight);
            canvas.rotate(45.0f, translationX, measuredHeight);
            canvas.translate(0.0f, -hl.L(3.0f));
        }
        rectF.set(translationX - hl.L(10.0f), measuredHeight - hl.L(10.0f), translationX + hl.L(10.0f), measuredHeight + hl.L(10.0f));
        canvas.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint);
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(230.0f), TLObject.FLAG_30), i2);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i) {
        c();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraFirstFrameAvailable() {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onScreenOnChange(boolean z) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onVideoAvailableChange(boolean z) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i, int i2) {
    }
}
