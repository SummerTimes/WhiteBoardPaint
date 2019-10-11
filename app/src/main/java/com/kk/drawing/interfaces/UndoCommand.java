package com.kk.drawing.interfaces;

/**
 * 
 * @author yangdong
 *
 */
public interface UndoCommand {

	public void undo();

	public void redo();

	public boolean canUndo();

	public boolean canRedo();
}
