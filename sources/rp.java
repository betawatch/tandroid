// default package

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class rp {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        xv2 xv2Var;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                xv2Var = new wv2(clipData, 3);
            } else {
                yv2 yv2Var = new yv2();
                yv2Var.b = clipData;
                yv2Var.c = (byte) 3;
                xv2Var = yv2Var;
            }
            ihc.j(textView, xv2Var.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        xv2 xv2Var;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            xv2Var = new wv2(clipData, 3);
        } else {
            yv2 yv2Var = new yv2();
            yv2Var.b = clipData;
            yv2Var.c = (byte) 3;
            xv2Var = yv2Var;
        }
        ihc.j(view, xv2Var.build());
        return true;
    }
}
