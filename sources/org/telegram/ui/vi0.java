package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vi0 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public float c;
    public final /* synthetic */ KeyEvent.Callback d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vi0(Context context, EditTextBoldCursor editTextBoldCursor, int i3) {
        super(context);
        this.a = i3;
        this.d = editTextBoldCursor;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                if (((StaticLayout) this.b) != null) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.g0.L(21.0f) + this.c, ((EditTextBoldCursor) this.d).getLineY() + org.telegram.messenger.g0.L(3.0f));
                    ((StaticLayout) this.b).draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 1:
                if (((StaticLayout) this.b) != null) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.g0.L(21.0f) + this.c, ((EditTextBoldCursor) this.d).getLineY() + org.telegram.messenger.g0.L(3.0f));
                    ((StaticLayout) this.b).draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 2:
                if (((StaticLayout) this.b) != null) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.g0.L(21.0f) + this.c, ((EditTextBoldCursor) this.d).getLineY() + org.telegram.messenger.g0.L(3.0f));
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
    public final void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(34.0f);
                StaticLayout p10 = ((EditTextBoldCursor) this.d).p(size);
                this.b = p10;
                if (p10 != null) {
                    int lineCount = p10.getLineCount();
                    int i11 = 0;
                    if (lineCount > 1) {
                        i10 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.b).getLineBottom(lineCount - 1) - ((StaticLayout) this.b).getLineBottom(0)) + org.telegram.messenger.g0.L(64.0f), TLObject.FLAG_30);
                    }
                    if (org.telegram.messenger.bd.a0) {
                        float f10 = 0.0f;
                        while (true) {
                            if (i11 < lineCount) {
                                if (((StaticLayout) this.b).getLineLeft(i11) != 0.0f) {
                                    this.c = 0.0f;
                                } else {
                                    f10 = Math.max(f10, ((StaticLayout) this.b).getLineWidth(i11));
                                    if (i11 == lineCount - 1) {
                                        this.c = size - f10;
                                    }
                                    i11++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i3, i10);
                break;
            case 1:
                int size2 = View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(34.0f);
                StaticLayout p11 = ((EditTextBoldCursor) this.d).p(size2);
                this.b = p11;
                if (p11 != null) {
                    int lineCount2 = p11.getLineCount();
                    int i12 = 0;
                    if (lineCount2 > 1) {
                        i10 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.b).getLineBottom(lineCount2 - 1) - ((StaticLayout) this.b).getLineBottom(0)) + org.telegram.messenger.g0.L(64.0f), TLObject.FLAG_30);
                    }
                    if (org.telegram.messenger.bd.a0) {
                        float f11 = 0.0f;
                        while (true) {
                            if (i12 < lineCount2) {
                                if (((StaticLayout) this.b).getLineLeft(i12) != 0.0f) {
                                    this.c = 0.0f;
                                } else {
                                    f11 = Math.max(f11, ((StaticLayout) this.b).getLineWidth(i12));
                                    if (i12 == lineCount2 - 1) {
                                        this.c = size2 - f11;
                                    }
                                    i12++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i3, i10);
                break;
            case 2:
                int size3 = View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(34.0f);
                StaticLayout p12 = ((EditTextBoldCursor) this.d).p(size3);
                this.b = p12;
                if (p12 != null) {
                    int lineCount3 = p12.getLineCount();
                    int i13 = 0;
                    if (lineCount3 > 1) {
                        i10 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.b).getLineBottom(lineCount3 - 1) - ((StaticLayout) this.b).getLineBottom(0)) + org.telegram.messenger.g0.L(64.0f), TLObject.FLAG_30);
                    }
                    if (org.telegram.messenger.bd.a0) {
                        float f12 = 0.0f;
                        while (true) {
                            if (i13 < lineCount3) {
                                if (((StaticLayout) this.b).getLineLeft(i13) != 0.0f) {
                                    this.c = 0.0f;
                                } else {
                                    f12 = Math.max(f12, ((StaticLayout) this.b).getLineWidth(i13));
                                    if (i13 == lineCount3 - 1) {
                                        this.c = size3 - f12;
                                    }
                                    i13++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i3, i10);
                break;
            default:
                super.onMeasure(i3, i10);
                org.telegram.ui.Components.fh0 fh0Var = ((org.telegram.ui.Components.og0) this.d).o1;
                float measuredHeight = (r0.n1 / 768.0f) * ((lg.k) this.b).getMeasuredHeight();
                if (this.c != measuredHeight) {
                    this.c = measuredHeight;
                    ViewGroup.LayoutParams layoutParams = fh0Var.getLayoutParams();
                    int i14 = (int) measuredHeight;
                    fh0Var.getLayoutParams().width = i14;
                    layoutParams.height = i14;
                    super.onMeasure(i3, i10);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi0(org.telegram.ui.Components.og0 og0Var, Context context, lg.k kVar) {
        super(context);
        this.a = 3;
        this.d = og0Var;
        this.b = kVar;
    }
}
