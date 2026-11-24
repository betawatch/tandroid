// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wy7 extends FrameLayout {
    public final /* synthetic */ byte a;
    public Object b;
    public float c;
    public final /* synthetic */ KeyEvent.Callback d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy7(ax8 ax8Var, Context context, c51 c51Var) {
        super(context);
        this.a = (byte) 3;
        this.d = ax8Var;
        this.b = c51Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        byte b = this.a;
        KeyEvent.Callback callback = this.d;
        switch (b) {
            case 0:
                if (((StaticLayout) this.b) != null) {
                    canvas.save();
                    canvas.translate(gm.L(21.0f) + this.c, ((EditTextBoldCursor) callback).getLineY() + gm.L(3.0f));
                    ((StaticLayout) this.b).draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 1:
                if (((StaticLayout) this.b) != null) {
                    canvas.save();
                    canvas.translate(gm.L(21.0f) + this.c, ((EditTextBoldCursor) callback).getLineY() + gm.L(3.0f));
                    ((StaticLayout) this.b).draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 2:
                if (((StaticLayout) this.b) != null) {
                    canvas.save();
                    canvas.translate(gm.L(21.0f) + this.c, ((EditTextBoldCursor) callback).getLineY() + gm.L(3.0f));
                    ((StaticLayout) this.b).draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        int i3 = 0;
        KeyEvent.Callback callback = this.d;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i) - gm.L(34.0f);
                StaticLayout p = ((EditTextBoldCursor) callback).p(size);
                this.b = p;
                if (p != null) {
                    int lineCount = p.getLineCount();
                    if (lineCount > 1) {
                        i2 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.b).getLineBottom(lineCount - 1) - ((StaticLayout) this.b).getLineBottom(0)) + gm.L(64.0f), TLObject.FLAG_30);
                    }
                    if (jb6.a0) {
                        float f = 0.0f;
                        while (true) {
                            if (i3 < lineCount) {
                                if (((StaticLayout) this.b).getLineLeft(i3) != 0.0f) {
                                    this.c = 0.0f;
                                } else {
                                    f = Math.max(f, ((StaticLayout) this.b).getLineWidth(i3));
                                    if (i3 == lineCount - 1) {
                                        this.c = size - f;
                                    }
                                    i3++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i, i2);
                break;
            case 1:
                int size2 = View.MeasureSpec.getSize(i) - gm.L(34.0f);
                StaticLayout p2 = ((EditTextBoldCursor) callback).p(size2);
                this.b = p2;
                if (p2 != null) {
                    int lineCount2 = p2.getLineCount();
                    if (lineCount2 > 1) {
                        i2 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.b).getLineBottom(lineCount2 - 1) - ((StaticLayout) this.b).getLineBottom(0)) + gm.L(64.0f), TLObject.FLAG_30);
                    }
                    if (jb6.a0) {
                        float f2 = 0.0f;
                        while (true) {
                            if (i3 < lineCount2) {
                                if (((StaticLayout) this.b).getLineLeft(i3) != 0.0f) {
                                    this.c = 0.0f;
                                } else {
                                    f2 = Math.max(f2, ((StaticLayout) this.b).getLineWidth(i3));
                                    if (i3 == lineCount2 - 1) {
                                        this.c = size2 - f2;
                                    }
                                    i3++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i, i2);
                break;
            case 2:
                int size3 = View.MeasureSpec.getSize(i) - gm.L(34.0f);
                StaticLayout p3 = ((EditTextBoldCursor) callback).p(size3);
                this.b = p3;
                if (p3 != null) {
                    int lineCount3 = p3.getLineCount();
                    if (lineCount3 > 1) {
                        i2 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.b).getLineBottom(lineCount3 - 1) - ((StaticLayout) this.b).getLineBottom(0)) + gm.L(64.0f), TLObject.FLAG_30);
                    }
                    if (jb6.a0) {
                        float f3 = 0.0f;
                        while (true) {
                            if (i3 < lineCount3) {
                                if (((StaticLayout) this.b).getLineLeft(i3) != 0.0f) {
                                    this.c = 0.0f;
                                } else {
                                    f3 = Math.max(f3, ((StaticLayout) this.b).getLineWidth(i3));
                                    if (i3 == lineCount3 - 1) {
                                        this.c = size3 - f3;
                                    }
                                    i3++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i, i2);
                break;
            default:
                super.onMeasure(i, i2);
                s09 s09Var = ((ax8) callback).q1;
                float measuredHeight = (r7.p1 / 768.0f) * ((c51) this.b).getMeasuredHeight();
                if (this.c != measuredHeight) {
                    this.c = measuredHeight;
                    ViewGroup.LayoutParams layoutParams = s09Var.getLayoutParams();
                    int i4 = (int) measuredHeight;
                    s09Var.getLayoutParams().width = i4;
                    layoutParams.height = i4;
                    super.onMeasure(i, i2);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wy7(Context context, EditTextBoldCursor editTextBoldCursor, byte b) {
        super(context);
        this.a = b;
        this.d = editTextBoldCursor;
    }
}
