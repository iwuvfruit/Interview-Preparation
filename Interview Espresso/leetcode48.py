class Solution(object):
	def rotate_img(self, matrix):
		matrix.reverse()
		for i in range(len(matrix)):
			for j in range(i):
				temp = matrix[j][i]
				matrix[j][i] = matrix[i][j]
				matrix[i][j] = temp
				